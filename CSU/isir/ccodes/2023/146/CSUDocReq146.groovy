/*************************************************************************************************************
*       Required Document for  146 Ccode                                                                     *
*       CSUDocReq146.groovy                                                                                  *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request any of each document CSU-BirthCertificate, CSU-Naturalization, Passport
// Owner Student Spouse Parent1 Parent2


boolean hasBC = receivedDocuments.hasDoc("CSU-BirthCertificate", "Student") && receivedDocuments.get("CSU-BirthCertificate", "Student").isAcceptable();
boolean hasPP = receivedDocuments.hasDoc("Passport", "Student") && receivedDocuments.get("Passport", "Student").isAcceptable();
boolean hasNP = receivedDocuments.hasDoc("CSU-Naturalization", "Student") && receivedDocuments.get("CSU-Naturalization", "Student").isAcceptable();

if (!(hasBC || hasPP || hasNP))
{
documentRequest.addAnyDocuments(["CSU-BirthCertificate", "Student"],["Passport", "Student"],["CSU-Naturalization", "Student"]);
}

return false;

