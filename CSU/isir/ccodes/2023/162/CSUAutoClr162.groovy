/*************************************************************************************************************
*       Accepted Document for  162 Ccode                                                                     *
*       CSUAutoClr162.groovy                                                                                 *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean hasRC = receivedDocuments.hasDoc("CSU-DD214", "Student") && receivedDocuments.get("CSU-DD214", "Student").isAcceptable();

if (hasRC)
{
return true;
}

return false;