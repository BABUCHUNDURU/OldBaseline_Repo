/*************************************************************************************************************
*       Required Document for  001 Ccode                                                                     *
*       CSUDocReq001.groovy                                                                                  *
*       08/25/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/

// Request each document CSU-HomelessForm
// Owner Student Spouse Parent1 Parent2


String isirValue1 = isirRecord.getIsirFieldValue("UNACCOMPANIEDYOUTHDETERMINEDBYSCHOOLDISTRICTLIAISON");
String isirValue2 = isirRecord.getIsirFieldValue("ATRISKOFHOMELESSNESS");

if (isirValue1 == "1")
{ 
documentRequest.addDocument("CSU-HomelessForm");
}

if (isirValue2 == "1")
{ 
documentRequest.addDocument("CSU-HomelessForm");
}

return;