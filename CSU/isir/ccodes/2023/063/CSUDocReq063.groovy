/*************************************************************************************************************
*       Required Document for  063 Ccode                                                                     *
*       CSUDocReq063.groovy                                                                                  *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request any of each document CSU-BirthCertificate, DriversLicense
// Owner Student Spouse Parent1 Parent2


boolean hasBC = receivedDocuments.hasDoc("CSU-BirthCertificate", "Student") && receivedDocuments.get("CSU-BirthCertificate", "Student").isAcceptable();
boolean hasDL = receivedDocuments.hasDoc("DriversLicense", "Student") && receivedDocuments.get("DriversLicense", "Student").isAcceptable();

if (!(hasBC || hasDL))
{
documentRequest.addAnyDocuments(["CSU-BirthCertificate", "Student"],["DriversLicense", "Student"]);
}

return false;

