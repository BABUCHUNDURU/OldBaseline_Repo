/*************************************************************************************************************
*       Accepted Document for 299 Ccode                                                                      *
*       CSUAutoClr299.groovy                                                                                  *
*       08/02/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean has1040 = receivedDocuments.hasDoc("1040", "Student") && receivedDocuments.get("1040", "Student").isAcceptable();
boolean hasHF = receivedDocuments.hasDoc("CSU-HomelessForm", "Student") && receivedDocuments.get("CSU-HomelessForm", "Student").isAcceptable();
boolean hasVI = receivedDocuments.hasDoc("VW-Ind", "Student") && receivedDocuments.get("VW-Ind", "Student").isAcceptable();



if (has1040 && hasHF && hasVI)
{
return true;
}



return false;