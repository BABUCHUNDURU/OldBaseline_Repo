/*************************************************
Oracle SFP - Coppin State University
ISIR Descrepancy Evaluation Script

Document: CSU-ARNCard (Alien Registration Card)

ISIR Field (and Owner) for Correction: ALIENREGISTRATIONNUMBER (Student)

Filename: IsirDiscrepancyEvaluationALIENREGISTRATIONNUMBER.groovy
Created 111521 Alexander Prendergast
Modified  by 

**************************************************/
@groovy.transform.BaseScript(com.oracle.sfp.scripting.api.sdk.autocomplete.IsirDiscrepancyEvaluationScript)
package CHANGE_ME // this should be updated to your actual package name

import com.oracle.sfp.scripting.api.*
import com.oracle.sfp.scripting.api.util.*

// get value of ISIR field to correct
String isirFieldValueForCorrection = isirRecord.getIsirFieldValue("ALIENREGISTRATIONNUMBER");
String documentCode = "CSU-ARNCard";
String documentOwner = "Student";
String attributeCode = "ALIENREGISTRATIONNUMBER";

boolean hasDocument = false;

// if document received and acceptable, and field is not null and field not blank spaces
if (receivedDocuments.hasDoc(documentCode, documentOwner) && receivedDocuments.get(documentCode, documentOwner).isAcceptable() && receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode) != null && !receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode).isAllWhitespace())
{
    hasDocument = true;

    // get field value from document
    // remove dashes 
    String documentFieldValue = receivedDocuments.get(documentCode, documentOwner).getDocumentField(attributeCode);
    // remove dashes
    documentFieldValue.replaceAll("-","");
    
    if (hasDocument)
    {
        // if field value from document
        if (documentFieldValue != isirFieldValueForCorrection)
        {
         discrepancyEvaluationResult.hasDiscrepancy = true;
         // 9 characters required, so pad
         discrepancyEvaluationResult.correctedValue = String.format("%09d",documentFieldValue);
         return;
        }
    }
}
