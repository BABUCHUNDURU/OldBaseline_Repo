/*************************************************
Oracle SFP - Coppin State University
ISIR Descrepancy Evaluation Script

ISIR Field for Correction: STUDENTSCHILDSUPPORTPAID

Filename: IsirDiscrepancyEvaluationSTUDENTSCHILDSUPPORTPAID.groovy
Created 111521 Alexander Prendergast
Modified  by 

**************************************************/
@groovy.transform.BaseScript(com.oracle.sfp.scripting.api.sdk.autocomplete.IsirDiscrepancyEvaluationScript)
package CHANGE_ME // this should be updated to your actual package name

import com.oracle.sfp.scripting.api.*
import com.oracle.sfp.scripting.api.util.*

// get value of ISIR field to correct
String isirFieldValueForCorrection = isirRecord.getIsirFieldValue("STUDENTSCHILDSUPPORTPAID");
String documentCode = "CSU-ChildSupportPaid";
String documentOwner = "Student";
String attributeCode = "TOTALCHILDSUPPORTPAID";

int isirFieldValueForCorrectionConverted = 0;
boolean isirFieldValueForCorrectionBlank = true;

if (!isirFieldValueForCorrection.isAllWhitespace())
{
    // convert to integer
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
        // if field value from document does not match ISIR
        if (documentFieldValue != isirFieldValueForCorrectionConverted)
        {
         discrepancyEvaluationResult.hasDiscrepancy = true;
         // 7 position format
         discrepancyEvaluationResult.correctedValue = String.format("%07d",documentFieldValue);
         return;
        }
    }
}
