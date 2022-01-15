/*************************************************************************************************************
*       Required Document for  064 Ccode                                                                     *
*       CSUDocReq064.groovy                                                                                  *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request any of each document LegalNameChange
// Owner Student Spouse Parent1 Parent2


boolean hasLNC = receivedDocuments.hasDoc("LegalNameChange", "Student") && receivedDocuments.get("LegalNameChange", "Student").isAcceptable();

if (!(hasLNC))
{
documentRequest.addDocument("LegalNameChange", "Student");
}

return false;
