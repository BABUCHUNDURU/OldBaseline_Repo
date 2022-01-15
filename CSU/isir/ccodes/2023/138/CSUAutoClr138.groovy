/*************************************************************************************************************
*       Accepted Document for 138 Ccode                                                                      *
*       CSUAutoClr138.groovy                                                                                  *
*       08/02/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/



boolean hasBC = receivedDocuments.hasDoc("CSU-BirthCertificate", "Student") && receivedDocuments.get("CSU-BirthCertificate", "Student").isAcceptable();
boolean hasSC = receivedDocuments.hasDoc("CSU-SSNCard", "Student") && receivedDocuments.get("CSU-SSNCard", "Student").isAcceptable();


if (hasBC && hasSC)
{
return true;
}


return false;