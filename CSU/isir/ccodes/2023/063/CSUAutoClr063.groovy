/*************************************************************************************************************
*       Accepted Document for  063 Ccode                                                                     *
*       CSUAutoClr063.groovy                                                                                 *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean hasBC = receivedDocuments.hasDoc("CSU-BirthCertificate", "Student") && receivedDocuments.get("CSU-BirthCertificate", "Student").isAcceptable();
boolean hasDL = receivedDocuments.hasDoc("DriversLicense", "Student") && receivedDocuments.get("DriversLicense", "Student").isAcceptable();

if (hasBC || hasDL)
{
return true;
}

return false;