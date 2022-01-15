/*************************************************************************************************************
*       Required Document for 046, 105, 109, 141, 142, 144 Ccodes                                            *
*       CSUDocReq046-105-109-141-142-144.groovy                                                              *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request any of each document CSU-Naturalization, CSU-EEPapers
// Owner Student Spouse Parent1 Parent2


boolean hasNAT = receivedDocuments.hasDoc("CSU-Naturalization", "Student") && receivedDocuments.get("CSU-Naturalization", "Student").isAcceptable();
boolean hasEEP = receivedDocuments.hasDoc("CSU-EEPapers", "Student") && receivedDocuments.get("CSU-EEPapers", "Student").isAcceptable();

if (!(hasNAT || hasEEP))
{
documentRequest.addAnyDocuments(["CSU-Naturalization", "Student"],["CSU-EEPapers", "Student"]);
}

return false;

