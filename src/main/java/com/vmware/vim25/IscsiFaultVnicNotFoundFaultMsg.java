
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IscsiFaultVnicNotFoundFault", targetNamespace = "urn:vim25")
public class IscsiFaultVnicNotFoundFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IscsiFaultVnicNotFound faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IscsiFaultVnicNotFoundFaultMsg(String message, IscsiFaultVnicNotFound faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IscsiFaultVnicNotFoundFaultMsg(String message, IscsiFaultVnicNotFound faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.IscsiFaultVnicNotFound
     */
    public IscsiFaultVnicNotFound getFaultInfo() {
        return faultInfo;
    }

}
