/**********************************************************************************************************************
*     Princeton Document Cancelation Script for 2022 Verf DOE Updates                                                      *
*     CancelV1Verf.groovy                                                                                             *
*     07-27-2021     Alexander Prendergast                                                                            *
**********************************************************************************************************************/

//ISIR Value checks

def currentISIR = isirRecord;
boolean selVerfFlag = false;
String verifcationFlag = "";


if (currentISIR != null)
{
 verifcationFlag = currentISIR.getIsirFieldValue("STUDENTISSELECTEDFORVER");
}
 
//Checks for Selected for Verification
if (verifcationFlag == "Y")
{
    selVerfFlag = true;
}

//Removes documents for V1 
/*requestedDocIdToCancel.add("VW-Dep");
requestedDocIdToCancel.add("VW-Ind");
requestedDocIdToCancel.add("TaxReturn");
requestedDocIdToCancel.add("NonFilingStatement");
*/

if (selVerfFlag)
{


if(requestedDocs.get("VW-Dep","Student") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("VW-Dep","Student").getDocumentRequestId());
}

if(requestedDocs.get("VW-Ind","Student") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("VW-Ind","Student").getDocumentRequestId());
}

if(requestedDocs.get("TaxReturn","Student") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("TaxReturn","Student").getDocumentRequestId());
}

if(requestedDocs.get("TaxReturn","Spouse") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("TaxReturn","Spouse").getDocumentRequestId());
}

if(requestedDocs.get("TaxReturn","Parent1") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("TaxReturn","Parent1").getDocumentRequestId());
}

if(requestedDocs.get("TaxReturn","Parent2") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("TaxReturn","Parent2").getDocumentRequestId());
}

if(requestedDocs.get("NonFilingStatement","Student") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("NonFilingStatement","Student").getDocumentRequestId());
}

if(requestedDocs.get("NonFilingStatement","Spouse") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("NonFilingStatement","Spouse").getDocumentRequestId());
}

if(requestedDocs.get("NonFilingStatement","Parent1") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("NonFilingStatement","Parent1").getDocumentRequestId());
}

if(requestedDocs.get("NonFilingStatement","Parent2") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("NonFilingStatement","Parent2").getDocumentRequestId());
}

if(requestedDocs.get("W2","Student") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("W2","Student").getDocumentRequestId());
}

if(requestedDocs.get("W2","Spouse") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("W2","Spouse").getDocumentRequestId());
}

if(requestedDocs.get("W2","Parent1") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("W2","Parent1").getDocumentRequestId());
}

if(requestedDocs.get("W2","Parent2") != null)
{
requestedDocIdToCancel.add(requestedDocs.get("W2","Parent2").getDocumentRequestId());
}

}