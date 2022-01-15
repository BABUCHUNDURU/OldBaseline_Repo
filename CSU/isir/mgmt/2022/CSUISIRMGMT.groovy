/**********************************************************************************************************************
*             CSU Script                                                                                              *
*             Subsequent ISIR MGT script   CSUISIRMGMT.groovy                                                         *
*             09-22-21    Alexander Prendergast                                                                       *
*             KHEAA CPS Transaction Active ISIR criteria                                                              *
*                                                                                                                     *
**********************************************************************************************************************/

def isirDoc = student.getDocuments().get("CSU-KHEAAVerify-2022");

// Checking for CSU-KHEAAVerify Document . If CSU-KHEAAVerify document does not exists, it sets ISIR to active till CSU-KHEAAVerify document is received.

 if ((isirDoc == null) || (!isirDoc.isAcceptable()))
{
   return true;
}




// Checking for CSU-KHEAAVerify Document . If CSU-KHEAAVerify received and acceptable
 //If the VerStsCode are C or R, then set new ISIR inbound record to inactive.

if ((isirDoc != null) && (isirDoc.isAcceptable()))
{
	def FaprodCorrectionValue = isirDoc.getDocumentField("VerStsCode");
	def FaprodCpsValue = isirDoc.getDocumentField("VerifiedTranCode");
    if ((FaprodCorrectionValue == "C") || (FaprodCorrectionValue == "R"))
    {
        return false;
    } 
}

 
return false;