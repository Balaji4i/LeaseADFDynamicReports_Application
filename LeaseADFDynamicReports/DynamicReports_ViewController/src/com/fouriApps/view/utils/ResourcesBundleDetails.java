package com.fouriApps.view.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

public class ResourcesBundleDetails {
    public ResourcesBundleDetails() {
        super();
    }
    
//    Note resourceBundlePath should be the complete package name of your resource Bundle
//    For example demo.mah.view.ViewControllerBundle
    
//Sample Calling code from java class
//        ResourcesBundleDetails.getResourceBundle("com.view.bundle.OmniyatReports");
//        Object a= ResourcesBundleDetails.getResourceBundleKey("com.view.bundle.OmniyatReports", "Text.ReportIp");
    
    public static FacesContext getFacesContext() {  
         return FacesContext.getCurrentInstance();  
       }  
       
       public static ResourceBundle getResourceBundle(String resourceBundlePath) {  
       System.err.println("root-->"+ResourceBundle.getBundle(resourceBundlePath, getFacesContext().getViewRoot().getLocale()));
         return ResourceBundle.getBundle(resourceBundlePath, getFacesContext().getViewRoot().getLocale());  
       }  
       
       public static Object getResourceBundleKey(String resourceBundlePath, String key) {  
         ResourceBundle bundle = getResourceBundle(resourceBundlePath);
         System.err.println("bundle"+bundle);
         return getResourceBundleKey(bundle, key);  
       }  
       
       public static Object getResourceBundleKey(ResourceBundle resourceBundle, String key) {
        Object bundleKeyValue;
        try {
            bundleKeyValue = resourceBundle.getString(key);
        } catch (MissingResourceException mrExp) {
            bundleKeyValue = "URL not found";
        }
        return bundleKeyValue;
    }  
    
    
    
 // Anothere blog code   
//    FacesContext fc = FacesContext.getCurrentInstance();
//            ResourceBundle bundle = fc.getApplication().getResourceBundle(fc,"bundle_name");
//            bundle.getString("resource_identifier");
}
