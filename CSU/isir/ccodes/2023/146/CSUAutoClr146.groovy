/*************************************************************************************************************
*       Accepted Document for  146 Ccode                                                                     *
*       CSUAutoClr146.groovy                                                             *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean hasBC = receivedDocuments.hasDoc("CSU-BirthCertificate", "Student") && receivedDocuments.get("CSU-BirthCertificate", "Student").isAcceptable();
boolean hasPP = receivedDocuments.hasDoc("Passport", "Student") && receivedDocuments.get("Passport", "Student").isAcceptable();
boolean hasNP = receivedDocuments.hasDoc("CSU-Naturalization", "Student") && receivedDocuments.get("CSU-Naturalization", "Student").isAcceptable();

if (hasBC || hasPP || hasNP)
{
return true;
}

return false;