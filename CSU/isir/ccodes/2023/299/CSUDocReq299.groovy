/*************************************************************************************************************
*       Required Document for 299 Ccode                                                                      *
*       CSUDocReq299.groovy                                                                                  *
*       08/02/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/
// Request each document CSU-HomelessYouth, 1040, VW-Ind
// Owner Student Spouse Parent1 Parent2


documentRequest.addDocument("CSU-HomelessForm", "Student");
documentRequest.addDocument("1040", "Student");
documentRequest.addDocument("VW-Ind", "Student");

/*documentRequest.addAnyDocuments(["CSU-HomelessYouth", "Student"],["1040", "Student"],["VW-Ind", "Student"]);*/