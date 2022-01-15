/*************************************************************************************************************
*       Accepted Document for  064 Ccode                                                                     *
*       CSUAutoClr064.groovy                                                                                 *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean hasDL = receivedDocuments.hasDoc("LegalNameChange", "Student") && receivedDocuments.get("LegalNameChange", "Student").isAcceptable();

if (hasDL)
{
return true;
}

return false;