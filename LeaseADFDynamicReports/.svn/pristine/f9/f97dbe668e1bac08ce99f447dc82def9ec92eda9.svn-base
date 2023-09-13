package com.fouriApps.view.backing;

import javax.faces.event.ActionEvent;
import com.fouriApps.view.utils.ADFUtils;
import com.fouriApps.view.utils.JSFUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;
import com.fouriApps.view.utils.ResourcesBundleDetails;

public class LeaseReport {
    private RichInputDate summaryDate;
    private RichInputDate detailDate;
    private RichInputDate fromDate;
    private RichInputDate toDate;
    private RichInputDate pdate;

    public LeaseReport() {
    }

    public void OnClickARSummary(ActionEvent actionEvent) throws ParseException {
               Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
               String proj_id=vo.getCurrentRow().getAttribute("Project")==null?"0":vo.getCurrentRow().getAttribute("Project").toString();
               String prop_id=vo.getCurrentRow().getAttribute("Property")==null?"59":vo.getCurrentRow().getAttribute("Property").toString();
               String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();
               String sDate=summaryDate.getValue()==null?"0":summaryDate.getValue().toString();
               String selectedDate=getFormattedDate(sDate);
               System.err.println("PROJECT_ID--->"+proj_id);
               System.err.println("PROPERTY_ID--->"+prop_id);
               System.err.println("FORMAT--->"+format);
           String path= "/LeaseTempNewReport/webresources/lease/ARsummary?P_PROJ_ID="+proj_id+"&P_PROP_ID="+prop_id+"&P_DATE="+selectedDate+"&P_FILE_FORMAT="+format; 
               url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
               
           }

    public void onClickARDetail(ActionEvent actionEvent) throws ParseException {
        Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
               String proj_id=vo.getCurrentRow().getAttribute("Project")==null?"0":vo.getCurrentRow().getAttribute("Project").toString();
               String prop_id=vo.getCurrentRow().getAttribute("Property")==null?"59":vo.getCurrentRow().getAttribute("Property").toString();
               String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();
               String aDate=detailDate.getValue()==null?"0":detailDate.getValue().toString();
              String selectedDate=getFormattedDate(aDate);
               System.err.println("PROJECT_ID--->"+proj_id);
               System.err.println("PROPERTY_ID--->"+prop_id);
               System.err.println("FORMAT--->"+format);
        String path= "/LeaseTempNewReport/webresources/lease/ARdetail?P_PROJ_ID="+proj_id+"&P_PROP_ID="+prop_id+"&P_DATE="+selectedDate+"&P_FILE_FORMAT="+format; 
        url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
        
    }

    public void onClickCustomerMaster(ActionEvent actionEvent) {
            Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
            String cust_id=vo.getCurrentRow().getAttribute("Customer")==null?"0":vo.getCurrentRow().getAttribute("Customer").toString();
               String prop_id=vo.getCurrentRow().getAttribute("Property")==null?"0":vo.getCurrentRow().getAttribute("Property").toString();
               String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();

               System.err.println("CUSTOMER_ID--->"+cust_id);
               System.err.println("PROPERTY_ID--->"+prop_id);
               System.err.println("FORMAT--->"+format);
           String path= "/LeaseTempNewReport/webresources/lease/Customermaster?P_CUST_ID="+cust_id+"&P_PROP_ID="+prop_id+"&P_FILE_FORMAT="+format; 
            url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
            
        }

    public void setSummaryDate(RichInputDate summaryDate) {
        this.summaryDate = summaryDate;
    }

    public RichInputDate getSummaryDate() {
        return summaryDate;
    }


    public void setDetailDate(RichInputDate detailDate) {
        this.detailDate = detailDate;
    }

    public RichInputDate getDetailDate() {
        return detailDate;
    }

    public void onClickPriceList(ActionEvent actionEvent) {
        Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
            String proj_id=vo.getCurrentRow().getAttribute("Project")==null?"0":vo.getCurrentRow().getAttribute("Project").toString();
               String prop_id=vo.getCurrentRow().getAttribute("Property")==null?"59":vo.getCurrentRow().getAttribute("Property").toString();
               String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();

               System.err.println("PROJECT_ID--->"+proj_id);
               System.err.println("PROPERTY_ID--->"+prop_id);
               System.err.println("FORMAT--->"+format);
         String path= "/LeaseTempNewReport/webresources/lease/PriceList?P_PROJ_ID="+proj_id+"&P_PROP_ID="+prop_id+"&P_FILE_FORMAT="+format; 
        url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
        
    }

    public void onClickInventoryStatus(ActionEvent actionEvent) {
        Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
            String build_id=vo.getCurrentRow().getAttribute("Buildings")==null?"0":vo.getCurrentRow().getAttribute("Buildings").toString();
               String prop_id=vo.getCurrentRow().getAttribute("Property")==null?"59":vo.getCurrentRow().getAttribute("Property").toString();
               String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();

               System.err.println("Build_Id--->"+build_id);
               System.err.println("PROPERTY_ID--->"+prop_id);
               System.err.println("FORMAT--->"+format);
           String path= "/LeaseTempNewReport/webresources/lease/InventoryStatus?P_PROP_ID="+prop_id+"&P_BUILD_ID="+build_id+"&P_FILE_FORMAT="+format;
          url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
     
    }

    public void onClickSales(ActionEvent actionEvent) throws ParseException {
               Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
               String url = null;
               ViewObject vo    = ADFUtils.findIterator("Report_ROVO1Iterator").getViewObject();
               String build=vo.getCurrentRow().getAttribute("Organizations")==null?"1":vo.getCurrentRow().getAttribute("Organizations").toString();
               String unittype=vo.getCurrentRow().getAttribute("Unit_Type")==null?"5":vo.getCurrentRow().getAttribute("Unit_Type").toString();
        String unitty;
        unitty = null;
        String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();
               String fDate=fromDate.getValue()==null?"0":fromDate.getValue().toString();
               String tDate=toDate.getValue()==null?"0":toDate.getValue().toString();
               String fromDt=getFormattedDate(fDate);
               String toDt=getFormattedDate(tDate);
               System.err.println("BUILD_ID--->"+build);
               System.err.println("UNIT_TYPE--->"+unittype);
               System.err.println("FORMAT--->"+format);
          String path=  "/LeaseTempNewReport/webresources/lease/Sales?P_BUILD_ID="+build+"&P_UNIT_TYPE="+unitty+"&F_DATE="+fromDt+"&T_DATE="+toDt+"&P_FILE_FORMAT="+format; 
           url=URLPort+path;
           System.err.println(url);
               FacesContext fctx = FacesContext.getCurrentInstance(); 
               ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
               StringBuilder script = new StringBuilder();
               script.append("window.open(\"" + url + "\");");
               erks.addScript(fctx, script.toString());
               
               
           }

    public void setFromDate(RichInputDate fromDate) {
        this.fromDate = fromDate;
    }

    public RichInputDate getFromDate() {
        return fromDate;
    }

    public void setToDate(RichInputDate toDate) {
        this.toDate = toDate;
    }

    public RichInputDate getToDate() {
        return toDate;
    }

public String getFormattedDate(String repDate) throws ParseException { 
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
        java.util.Date date = formatter.parse(repDate);  
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        return ft.format(date);
    }

    public void onClickSOASummary(ActionEvent actionEvent) throws ParseException {
        Object URLPort= ResourcesBundleDetails.getResourceBundleKey("com.fouriApps.view.bundle.OmniyatReports", "Text.ReportIp");
        System.err.println("Enter into the download method");
        String url = null;
        ViewObject vo    = ADFUtils.findIterator("SOA_Summary_ROVO1Iterator").getViewObject();
        String custId=vo.getCurrentRow().getAttribute("CustId")==null?"1":vo.getCurrentRow().getAttribute("CustId").toString();
        String format=vo.getCurrentRow().getAttribute("Format")==null?"0":vo.getCurrentRow().getAttribute("Format").toString();
        String fDate=pdate.getValue()==null?"0":pdate.getValue().toString();
        String reportdate=getFormattedDate(fDate);
        System.err.println("CUSTOMER_ID--->"+custId);
        String path=  "/LeaseTempNewReport/webresources/lease/SOAsummary?P_CUST_ID="+custId+"&P_DATE="+reportdate+"&P_FILE_FORMAT="+format;
        url=URLPort+path;
        System.err.println(url);
        FacesContext fctx = FacesContext.getCurrentInstance(); 
        ExtendedRenderKitService erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        StringBuilder script = new StringBuilder();
        script.append("window.open(\"" + url + "\");");
        erks.addScript(fctx, script.toString());
        
        
    }

    public void setPdate(RichInputDate pdate) {
        this.pdate = pdate;
    }

    public RichInputDate getPdate() {
        return pdate;
    }
}


