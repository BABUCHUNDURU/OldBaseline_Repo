/*************************************************
Oracle SFP - Coppin State University
ISIR Descrepancy Evaluation Script

ISIR Field for Correction: PARENT1DATEOFBIRTH

Filename: IsirDiscrepancyEvaluationPARENT1DATEOFBIRTH.groovy
Created 111521 Alexander Prendergast
Modified  by 

**************************************************/

//file:noinspection UnnecessaryQualifiedReference
@groovy.transform.BaseScript(com.oracle.sfp.scripting.api.sdk.autocomplete.IsirDiscrepancyEvaluationScript)
package CHANGE_ME // this should be updated to your actual package name

import com.oracle.sfp.scripting.api.*
import com.oracle.sfp.scripting.api.util.*

String isirFieldValueForCorrection = isirRecord.getIsirFieldValue("PARENT1DATEOFBIRTH");
String documentCode = "CSU-BirthCertificate";
String documentOwner = "Parent1";
String attributeCode = "DOB";


if (receivedDocuments.hasDoc(documentCode,documentOwner) && receivedDocuments.get(documentCode,documentOwner).isAcceptable() && receivedDocuments.get(documentCode,documentOwner).getDocumentField(attributeCode) != null && !receivedDocuments.get(documentCode,documentOwner).getDocumentField(attributeCode).isAllWhitespace())
{
    String documentValue = receivedDocuments.get(documentCode,documentOwner).getDocumentField(attributeCode).replaceAll("-","");
    if (documentValue != isirFieldValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}
