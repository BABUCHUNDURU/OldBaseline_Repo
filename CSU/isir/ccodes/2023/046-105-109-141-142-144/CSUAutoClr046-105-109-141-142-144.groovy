/*************************************************************************************************************
*       Accepted Document for 046, 105, 109, 141, 142, 144 Ccodes                                            *
*       CSUAutoClr046-105-109-141-142-144.groovy                                                             *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


boolean hasNAT = receivedDocuments.hasDoc("CSU-Naturalization", "Student") && receivedDocuments.get("CSU-Naturalization", "Student").isAcceptable();
boolean hasEEP = receivedDocuments.hasDoc("CSU-EEPapers", "Student") && receivedDocuments.get("CSU-EEPapers", "Student").isAcceptable();



if (hasNAT || hasEEP)
{
return true;
}



return false;