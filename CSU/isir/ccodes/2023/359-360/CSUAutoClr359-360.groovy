/*************************************************************************************************************
*       Accepted Document for 359, 360 Ccodes                                                                      *
*       CSUAutoClr359-360.groovy                                                                                  *
*       08/02/2021     Ravi Settipalle                                                                       *
**************************************************************************************************************/


if ((receivedDocuments.hasDoc("CSU-UEH", "Student") && receivedDocuments.get("CSU-UEH", "Student").isAcceptable()))
    {
        return true;
    }
return false;

