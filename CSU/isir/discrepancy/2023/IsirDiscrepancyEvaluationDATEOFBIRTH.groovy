/*************************************************
Oracle SFP - Coppin State University
ISIR Descrepancy Evaluation Script
Created from Oracle SFP Baseline Script 

ISIR Field for Correction: DATEOFBIRTH

Filename: IsirDiscrepancyEvaluationDATEOFBIRTH.groovy
Created 111521 Alexander Prendergast
Modified  by 

**************************************************/

//file:noinspection UnnecessaryQualifiedReference
@groovy.transform.BaseScript(com.oracle.sfp.scripting.api.sdk.autocomplete.IsirDiscrepancyEvaluationScript)
package CHANGE_ME // this should be updated to your actual package name

import com.oracle.sfp.scripting.api.*
import com.oracle.sfp.scripting.api.util.*

String isirStudentISIRValueForCorrection = isirRecord.getIsirFieldValue("DATEOFBIRTH");

if (receivedDocuments.hasDoc("DriversLicense","Student") && receivedDocuments.get("DriversLicense","Student").isAcceptable() && receivedDocuments.get("DriversLicense", "Student").getDocumentField("AC1003") != null && !receivedDocuments.get("DriversLicense", "Student").getDocumentField("AC1003").isAllWhitespace())
{
    String documentValue = receivedDocuments.get("DriversLicense", "Student").getDocumentField("AC1003").replaceAll("-","");
    if (documentValue != isirStudentISIRValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}

if (receivedDocuments.hasDoc("NonDriversLicenseID","Student") && receivedDocuments.get("NonDriversLicenseID","Student").isAcceptable() && receivedDocuments.get("NonDriversLicenseID", "Student").getDocumentField("AC1003") != null && !receivedDocuments.get("NonDriversLicenseID", "Student").getDocumentField("AC1003").isAllWhitespace())
{
    String documentValue = receivedDocuments.get("NonDriversLicenseID", "Student").getDocumentField("AC1003").replaceAll("-","");
    if (documentValue != isirStudentISIRValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}

if (receivedDocuments.hasDoc("StateIssuedID","Student") && receivedDocuments.get("StateIssuedID","Student").isAcceptable() && receivedDocuments.get("StateIssuedID", "Student").getDocumentField("AC1003") != null && !receivedDocuments.get("StateIssuedID", "Student").getDocumentField("AC1003").isAllWhitespace())
{
    String documentValue = receivedDocuments.get("StateIssuedID", "Student").getDocumentField("AC1003").replaceAll("-","");
    if (documentValue != isirStudentISIRValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}

if (receivedDocuments.hasDoc("Passport","Student") && receivedDocuments.get("Passport","Student").isAcceptable() && receivedDocuments.get("Passport", "Student").getDocumentField("AC1003") != null && !receivedDocuments.get("Passport", "Student").getDocumentField("AC1003").isAllWhitespace())
{
    String documentValue = receivedDocuments.get("Passport", "Student").getDocumentField("AC1003").replaceAll("-","");
    if (documentValue != isirStudentISIRValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}

// CSU Documents

if (receivedDocuments.hasDoc("CSU-BirthCertificate","Student") && receivedDocuments.get("CSU-BirthCertificate","Student").isAcceptable() && receivedDocuments.get("CSU-BirthCertificate", "Student").getDocumentField("DOB") != null && !receivedDocuments.get("CSU-BirthCertificate", "Student").getDocumentField("DOB").isAllWhitespace())
{
    String documentValue = receivedDocuments.get("CSU-BirthCertificate", "Student").getDocumentField("DOB").replaceAll("-","");
    if (documentValue != isirStudentISIRValueForCorrection)
    {
        discrepancyEvaluationResult.hasDiscrepancy = true;
        discrepancyEvaluationResult.correctedValue = documentValue;
        return;
    }
}

