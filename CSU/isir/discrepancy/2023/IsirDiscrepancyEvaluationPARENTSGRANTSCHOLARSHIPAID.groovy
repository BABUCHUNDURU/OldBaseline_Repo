/*************************************************
Oracle SFP - Coppin State University
ISIR Descrepancy Evaluation Script

ISIR Field for Correction: PARENTSGRANTSCHOLARSHIPAID

Filename: IsirDiscrepancyEvaluationPARENTSGRANTSCHOLARSHIPAID.groovy
Created 111521 Alexander Prendergast
Modified  by 

**************************************************/
@groovy.transform.BaseScript(com.oracle.sfp.scripting.api.sdk.autocomplete.IsirDiscrepancyEvaluationScript)
package CHANGE_ME // this should be updated to your actual package name

import com.oracle.sfp.scripting.api.*
import com.oracle.sfp.scripting.api.util.*

// get value of ISIR field to correct
String isirFieldValueForCorrection = isirRecord.getIsirFieldValue("PARENTSGRANTSCHOLARSHIPAID");
String documentCode = "CSU-1098T";
String documentOwner = "Parent1";
String attributeCode = "CREDIT";

int isirFieldValueForCorrectionConverted = 0;
boolean isirFieldValueForCorrectionBlank = true;

if (!isirFieldValueForCorrection.isAllWhitespace())
{
    isirFieldValueForCorrectionConverted = isirFieldValueForCorrection.toInteger();
    isirFieldValueForCorrectionBlank = false;
}

int documentFieldValue = 0;

boolean hasDocument = false;

// if document received and acceptable, and field is not null and field not blank spaces
if (receivedDocuments.hasDoc(documentCode, documentOwner) && receivedDocuments.get(documentCode, documentOwner).isAcceptable() && receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode) != null && !receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode).isAllWhitespace())
{
    hasDocument = true;

    // get field value from document and convert to integer
    documentFieldValue = receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode).toFloat().round();

    if (hasDocument)
    {
        // if field value from document
        if (documentFieldValue != isirFieldValueForCorrectionConverted)
        {
         discrepancyEvaluationResult.hasDiscrepancy = true;
         // 7 position format
         discrepancyEvaluationResult.correctedValue = String.format("%07d",documentFieldValue);
         return;
        }
    }
}
