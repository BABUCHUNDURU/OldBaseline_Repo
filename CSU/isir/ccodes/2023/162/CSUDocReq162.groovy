/*************************************************************************************************************
*       Required Document for  162 Ccode                                                                     *
*       CSUDocReq162.groovy                                                                                  *
*       08/03/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request any of each document CSU-DD214
// Owner Student Spouse Parent1 Parent2


boolean hasRC = receivedDocuments.hasDoc("CSU-DD214", "Student") && receivedDocuments.get("CSU-DD214", "Student").isAcceptable();

if (!(hasRC))
{
documentRequest.addDocument("CSU-DD214", "Student");
}

return false;

