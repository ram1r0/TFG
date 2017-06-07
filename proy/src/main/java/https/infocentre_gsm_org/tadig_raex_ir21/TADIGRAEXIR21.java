
package https.infocentre_gsm_org.tadig_raex_ir21;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "raexir21FileHeader",
    "organisationInfo"
})
@XmlRootElement(name = "TADIGRAEXIR21", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
public class TADIGRAEXIR21 implements Serializable {

    @XmlElement(name = "RAEXIR21FileHeader", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
    protected TADIGRAEXIR21 .RAEXIR21FileHeader raexir21FileHeader;
    @XmlElement(name = "OrganisationInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
    protected TADIGRAEXIR21 .OrganisationInfo organisationInfo;

    
    public TADIGRAEXIR21 .RAEXIR21FileHeader getRAEXIR21FileHeader() {
        return raexir21FileHeader;
    }

    
    public void setRAEXIR21FileHeader(TADIGRAEXIR21 .RAEXIR21FileHeader value) {
        this.raexir21FileHeader = value;
    }

    
    public TADIGRAEXIR21 .OrganisationInfo getOrganisationInfo() {
        return organisationInfo;
    }

    
    public void setOrganisationInfo(TADIGRAEXIR21 .OrganisationInfo value) {
        this.organisationInfo = value;
    }


    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "organisationName",
        "countryInitials",
        "networkList"
    })
    public static class OrganisationInfo implements Serializable {

        @XmlElement(name = "OrganisationName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
        protected String organisationName;
        @XmlElement(name = "CountryInitials", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
        protected String countryInitials;
        @XmlElement(name = "NetworkList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList networkList;

        
        public String getOrganisationName() {
            return organisationName;
        }

        
        public void setOrganisationName(String value) {
            this.organisationName = value;
        }

        
        public String getCountryInitials() {
            return countryInitials;
        }

        
        public void setCountryInitials(String value) {
            this.countryInitials = value;
        }

        
        public TADIGRAEXIR21 .OrganisationInfo.NetworkList getNetworkList() {
            return networkList;
        }

        
        public void setNetworkList(TADIGRAEXIR21 .OrganisationInfo.NetworkList value) {
            this.networkList = value;
        }


        
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "network"
        })
        public static class NetworkList implements Serializable {

            @XmlElement(name = "Network", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
            protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network> network;

            
            public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network> getNetwork() {
                if (network == null) {
                    network = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network>();
                }
                return this.network;
            }


            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tadigCode",
                "networkType",
                "networkData",
                "hostedNetworksInfo",
                "presentationOfCountryInitialsAndMNN",
                "abbreviatedMNN",
                "networkColourCode"
            })
            public static class Network implements Serializable {

                @XmlElement(name = "TADIGCode", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                protected String tadigCode;
                @XmlElement(name = "NetworkType", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                protected String networkType;
                @XmlElement(name = "NetworkData", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData networkData;
                @XmlElement(name = "HostedNetworksInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.HostedNetworksInfo hostedNetworksInfo;
                @XmlElement(name = "PresentationOfCountryInitialsAndMNN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                protected String presentationOfCountryInitialsAndMNN;
                @XmlElement(name = "AbbreviatedMNN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                protected String abbreviatedMNN;
                @XmlElement(name = "NetworkColourCode", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                protected String networkColourCode;

                
                public String getTADIGCode() {
                    return tadigCode;
                }

                
                public void setTADIGCode(String value) {
                    this.tadigCode = value;
                }

                
                public String getNetworkType() {
                    return networkType;
                }

                
                public void setNetworkType(String value) {
                    this.networkType = value;
                }

                
                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData getNetworkData() {
                    return networkData;
                }

                
                public void setNetworkData(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData value) {
                    this.networkData = value;
                }

                
                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.HostedNetworksInfo getHostedNetworksInfo() {
                    return hostedNetworksInfo;
                }

                
                public void setHostedNetworksInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.HostedNetworksInfo value) {
                    this.hostedNetworksInfo = value;
                }

                
                public String getPresentationOfCountryInitialsAndMNN() {
                    return presentationOfCountryInitialsAndMNN;
                }

                
                public void setPresentationOfCountryInitialsAndMNN(String value) {
                    this.presentationOfCountryInitialsAndMNN = value;
                }

                
                public String getAbbreviatedMNN() {
                    return abbreviatedMNN;
                }

                
                public void setAbbreviatedMNN(String value) {
                    this.abbreviatedMNN = value;
                }

                
                public String getNetworkColourCode() {
                    return networkColourCode;
                }

                
                public void setNetworkColourCode(String value) {
                    this.networkColourCode = value;
                }


                
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "sectionNA"
                })
                public static class HostedNetworksInfo implements Serializable{

                    @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected String sectionNA;

                    
                    public String getSectionNA() {
                        return sectionNA;
                    }

                    
                    public void setSectionNA(String value) {
                        this.sectionNA = value;
                    }

                }


                
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "routingInfoSection",
                    "internationalSCCPGatewaySection",
                    "domesticSCCPGatewaySection",
                    "sccpProtocolAvailableAtPMNSection",
                    "subscrIdentityAuthenticationSection",
                    "testNumbersInfoSection",
                    "mapGeneralInfoSection",
                    "mapOptimalRoutingSection",
                    "mapInterOperatorSMSEnhancementSection",
                    "networkElementsInfoSection",
                    "ussdInfoSection",
                    "camelInfoSection",
                    "packetDataServiceInfoSection",
                    "ipRoamingIWInfoSection",
                    "mmsiwInfoSection",
                    "wlanInfoSection",
                    "lteInfoSection",
                    "contactInfoSection"
                })
                public static class NetworkData implements Serializable{

                    @XmlElement(name = "RoutingInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection routingInfoSection;
                    @XmlElement(name = "InternationalSCCPGatewaySection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection internationalSCCPGatewaySection;
                    @XmlElement(name = "DomesticSCCPGatewaySection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.DomesticSCCPGatewaySection domesticSCCPGatewaySection;
                    @XmlElement(name = "SCCPProtocolAvailableAtPMNSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection sccpProtocolAvailableAtPMNSection;
                    @XmlElement(name = "SubscrIdentityAuthenticationSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SubscrIdentityAuthenticationSection subscrIdentityAuthenticationSection;
                    @XmlElement(name = "TestNumbersInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection testNumbersInfoSection;
                    @XmlElement(name = "MAPGeneralInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection mapGeneralInfoSection;
                    @XmlElement(name = "MAPOptimalRoutingSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection mapOptimalRoutingSection;
                    @XmlElement(name = "MAPInterOperatorSMSEnhancementSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection mapInterOperatorSMSEnhancementSection;
                    @XmlElement(name = "NetworkElementsInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection networkElementsInfoSection;
                    @XmlElement(name = "USSDInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection ussdInfoSection;
                    @XmlElement(name = "CAMELInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection camelInfoSection;
                    @XmlElement(name = "PacketDataServiceInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection packetDataServiceInfoSection;
                    @XmlElement(name = "IPRoaming_IW_InfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection ipRoamingIWInfoSection;
                    @XmlElement(name = "MMS_IW_InfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection mmsiwInfoSection;
                    @XmlElement(name = "WLANInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.WLANInfoSection wlanInfoSection;
                    @XmlElement(name = "LTEInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection lteInfoSection;
                    @XmlElement(name = "ContactInfoSection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection contactInfoSection;

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection getRoutingInfoSection() {
                        return routingInfoSection;
                    }

                    
                    public void setRoutingInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection value) {
                        this.routingInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection getInternationalSCCPGatewaySection() {
                        return internationalSCCPGatewaySection;
                    }

                    
                    public void setInternationalSCCPGatewaySection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection value) {
                        this.internationalSCCPGatewaySection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.DomesticSCCPGatewaySection getDomesticSCCPGatewaySection() {
                        return domesticSCCPGatewaySection;
                    }

                    
                    public void setDomesticSCCPGatewaySection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.DomesticSCCPGatewaySection value) {
                        this.domesticSCCPGatewaySection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection getSCCPProtocolAvailableAtPMNSection() {
                        return sccpProtocolAvailableAtPMNSection;
                    }

                    
                    public void setSCCPProtocolAvailableAtPMNSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection value) {
                        this.sccpProtocolAvailableAtPMNSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SubscrIdentityAuthenticationSection getSubscrIdentityAuthenticationSection() {
                        return subscrIdentityAuthenticationSection;
                    }

                    
                    public void setSubscrIdentityAuthenticationSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SubscrIdentityAuthenticationSection value) {
                        this.subscrIdentityAuthenticationSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection getTestNumbersInfoSection() {
                        return testNumbersInfoSection;
                    }

                    
                    public void setTestNumbersInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection value) {
                        this.testNumbersInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection getMAPGeneralInfoSection() {
                        return mapGeneralInfoSection;
                    }

                    
                    public void setMAPGeneralInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection value) {
                        this.mapGeneralInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection getMAPOptimalRoutingSection() {
                        return mapOptimalRoutingSection;
                    }

                    
                    public void setMAPOptimalRoutingSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection value) {
                        this.mapOptimalRoutingSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection getMAPInterOperatorSMSEnhancementSection() {
                        return mapInterOperatorSMSEnhancementSection;
                    }

                    
                    public void setMAPInterOperatorSMSEnhancementSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection value) {
                        this.mapInterOperatorSMSEnhancementSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection getNetworkElementsInfoSection() {
                        return networkElementsInfoSection;
                    }

                    
                    public void setNetworkElementsInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection value) {
                        this.networkElementsInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection getUSSDInfoSection() {
                        return ussdInfoSection;
                    }

                    
                    public void setUSSDInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection value) {
                        this.ussdInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection getCAMELInfoSection() {
                        return camelInfoSection;
                    }

                    
                    public void setCAMELInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection value) {
                        this.camelInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection getPacketDataServiceInfoSection() {
                        return packetDataServiceInfoSection;
                    }

                    
                    public void setPacketDataServiceInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection value) {
                        this.packetDataServiceInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection getIPRoamingIWInfoSection() {
                        return ipRoamingIWInfoSection;
                    }

                    
                    public void setIPRoamingIWInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection value) {
                        this.ipRoamingIWInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection getMMSIWInfoSection() {
                        return mmsiwInfoSection;
                    }

                    
                    public void setMMSIWInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection value) {
                        this.mmsiwInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.WLANInfoSection getWLANInfoSection() {
                        return wlanInfoSection;
                    }

                    
                    public void setWLANInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.WLANInfoSection value) {
                        this.wlanInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection getLTEInfoSection() {
                        return lteInfoSection;
                    }

                    
                    public void setLTEInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection value) {
                        this.lteInfoSection = value;
                    }

                    
                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection getContactInfoSection() {
                        return contactInfoSection;
                    }

                    
                    public void setContactInfoSection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection value) {
                        this.contactInfoSection = value;
                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "camelInfo"
                    })
                    public static class CAMELInfoSection implements Serializable{

                        @XmlElement(name = "CAMELInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo camelInfo;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo getCAMELInfo() {
                            return camelInfo;
                        }

                        
                        public void setCAMELInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo value) {
                            this.camelInfo = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "gsmssfmsc",
                            "camelReroutingNumberingInfo",
                            "changeHistory"
                        })
                        public static class CAMELInfo implements Serializable{

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "GSM_SSF_MSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC gsmssfmsc;
                            @XmlElement(name = "CAMEL_Rerouting_Numbering_Info", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.CAMELReroutingNumberingInfo camelReroutingNumberingInfo;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC getGSMSSFMSC() {
                                return gsmssfmsc;
                            }

                            
                            public void setGSMSSFMSC(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC value) {
                                this.gsmssfmsc = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.CAMELReroutingNumberingInfo getCAMELReroutingNumberingInfo() {
                                return camelReroutingNumberingInfo;
                            }

                            
                            public void setCAMELReroutingNumberingInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.CAMELReroutingNumberingInfo value) {
                                this.camelReroutingNumberingInfo = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "camelReroutingNumber"
                            })
                            public static class CAMELReroutingNumberingInfo implements Serializable{

                                @XmlElement(name = "CAMEL_Rerouting_Number", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String camelReroutingNumber;

                                
                                public String getCAMELReroutingNumber() {
                                    return camelReroutingNumber;
                                }

                                
                                public void setCAMELReroutingNumber(String value) {
                                    this.camelReroutingNumber = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory implements Serializable{

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem implements Serializable{

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "capVersionSupportedMSC"
                            })
                            public static class GSMSSFMSC implements Serializable{

                                @XmlElement(name = "CAP_Version_Supported_MSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC capVersionSupportedMSC;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC getCAPVersionSupportedMSC() {
                                    return capVersionSupportedMSC;
                                }

                                
                                public void setCAPVersionSupportedMSC(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC value) {
                                    this.capVersionSupportedMSC = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "capVerSuppMSCInbound",
                                    "capVerSuppMSCOutbound"
                                })
                                public static class CAPVersionSupportedMSC implements Serializable{

                                    @XmlElement(name = "CAP_Ver_Supp_MSC_Inbound", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCInbound capVerSuppMSCInbound;
                                    @XmlElement(name = "CAP_Ver_Supp_MSC_Outbound", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCOutbound capVerSuppMSCOutbound;

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCInbound getCAPVerSuppMSCInbound() {
                                        return capVerSuppMSCInbound;
                                    }

                                    
                                    public void setCAPVerSuppMSCInbound(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCInbound value) {
                                        this.capVerSuppMSCInbound = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCOutbound getCAPVerSuppMSCOutbound() {
                                        return capVerSuppMSCOutbound;
                                    }

                                    
                                    public void setCAPVerSuppMSCOutbound(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.CAMELInfoSection.CAMELInfo.GSMSSFMSC.CAPVersionSupportedMSC.CAPVerSuppMSCOutbound value) {
                                        this.capVerSuppMSCOutbound = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "capmscVersion"
                                    })
                                    public static class CAPVerSuppMSCInbound implements Serializable{

                                        @XmlElement(name = "CAP_MSCVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected List<String> capmscVersion;

                                        
                                        public List<String> getCAPMSCVersion() {
                                            if (capmscVersion == null) {
                                                capmscVersion = new ArrayList<String>();
                                            }
                                            return this.capmscVersion;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "capmscVersion"
                                    })
                                    public static class CAPVerSuppMSCOutbound implements Serializable{

                                        @XmlElement(name = "CAP_MSCVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String capmscVersion;

                                        
                                        public String getCAPMSCVersion() {
                                            return capmscVersion;
                                        }

                                        
                                        public void setCAPMSCVersion(String value) {
                                            this.capmscVersion = value;
                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "contactInfo",
                        "sectionNA"
                    })
                    public static class ContactInfoSection implements Serializable{

                        @XmlElement(name = "ContactInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo contactInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo getContactInfo() {
                            return contactInfo;
                        }

                        
                        public void setContactInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo value) {
                            this.contactInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "rtContactInfoList",
                            "sccpInquiriesAndOrderingOfSS7Routes",
                            "roamingCoordinator",
                            "iregTests",
                            "tadigTests",
                            "camelTests",
                            "gprsContact",
                            "grxProviderAuthorityVerificationContactAtPMN",
                            "iwmmsContact",
                            "otherContact",
                            "ir21DistributionEmailAddressList",
                            "changeHistory"
                        })
                        public static class ContactInfo implements Serializable{

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "RTContactInfoList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList rtContactInfoList;
                            @XmlElement(name = "SCCPInquiriesAndOrderingOfSS7Routes", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes sccpInquiriesAndOrderingOfSS7Routes;
                            @XmlElement(name = "RoamingCoordinator", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator roamingCoordinator;
                            @XmlElement(name = "IREGTests", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests iregTests;
                            @XmlElement(name = "TADIGTests", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests tadigTests;
                            @XmlElement(name = "CAMELTests", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests camelTests;
                            @XmlElement(name = "GPRSContact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact gprsContact;
                            @XmlElement(name = "GRXProviderAuthorityVerificationContactAtPMN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN grxProviderAuthorityVerificationContactAtPMN;
                            @XmlElement(name = "IW_MMS_Contact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact iwmmsContact;
                            @XmlElement(name = "Other_Contact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact otherContact;
                            @XmlElement(name = "IR21DistributionEmailAddressList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IR21DistributionEmailAddressList ir21DistributionEmailAddressList;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList getRTContactInfoList() {
                                return rtContactInfoList;
                            }

                            
                            public void setRTContactInfoList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList value) {
                                this.rtContactInfoList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes getSCCPInquiriesAndOrderingOfSS7Routes() {
                                return sccpInquiriesAndOrderingOfSS7Routes;
                            }

                            
                            public void setSCCPInquiriesAndOrderingOfSS7Routes(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes value) {
                                this.sccpInquiriesAndOrderingOfSS7Routes = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator getRoamingCoordinator() {
                                return roamingCoordinator;
                            }

                            
                            public void setRoamingCoordinator(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator value) {
                                this.roamingCoordinator = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests getIREGTests() {
                                return iregTests;
                            }

                            
                            public void setIREGTests(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests value) {
                                this.iregTests = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests getTADIGTests() {
                                return tadigTests;
                            }

                            
                            public void setTADIGTests(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests value) {
                                this.tadigTests = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests getCAMELTests() {
                                return camelTests;
                            }

                            
                            public void setCAMELTests(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests value) {
                                this.camelTests = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact getGPRSContact() {
                                return gprsContact;
                            }

                            
                            public void setGPRSContact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact value) {
                                this.gprsContact = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN getGRXProviderAuthorityVerificationContactAtPMN() {
                                return grxProviderAuthorityVerificationContactAtPMN;
                            }

                            
                            public void setGRXProviderAuthorityVerificationContactAtPMN(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN value) {
                                this.grxProviderAuthorityVerificationContactAtPMN = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact getIWMMSContact() {
                                return iwmmsContact;
                            }

                            
                            public void setIWMMSContact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact value) {
                                this.iwmmsContact = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact getOtherContact() {
                                return otherContact;
                            }

                            
                            public void setOtherContact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact value) {
                                this.otherContact = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IR21DistributionEmailAddressList getIR21DistributionEmailAddressList() {
                                return ir21DistributionEmailAddressList;
                            }

                            
                            public void setIR21DistributionEmailAddressList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IR21DistributionEmailAddressList value) {
                                this.ir21DistributionEmailAddressList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class CAMELTests implements Serializable{

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson implements Serializable{

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.CAMELTests.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory  implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem  implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class GPRSContact  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GPRSContact.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class GRXProviderAuthorityVerificationContactAtPMN  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.GRXProviderAuthorityVerificationContactAtPMN.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "ir21DistributionEmailAddress"
                            })
                            public static class IR21DistributionEmailAddressList  implements Serializable {

                                @XmlElement(name = "IR21DistributionEmailAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String ir21DistributionEmailAddress;

                                
                                public String getIR21DistributionEmailAddress() {
                                    return ir21DistributionEmailAddress;
                                }

                                
                                public void setIR21DistributionEmailAddress(String value) {
                                    this.ir21DistributionEmailAddress = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class IREGTests  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IREGTests.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected List<String> email;

                                        
                                        public List<String> getEmail() {
                                            if (email == null) {
                                                email = new ArrayList<String>();
                                            }
                                            return this.email;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class IWMMSContact  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson contactPerson;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson getContactPerson() {
                                    return contactPerson;
                                }

                                
                                public void setContactPerson(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson value) {
                                    this.contactPerson = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.IWMMSContact.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class OtherContact  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "phoneMobileList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "PhoneMobileList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneMobileList phoneMobileList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneMobileList getPhoneMobileList() {
                                        return phoneMobileList;
                                    }

                                    
                                    public void setPhoneMobileList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.PhoneMobileList value) {
                                        this.phoneMobileList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.OtherContact.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected List<String> email;

                                        
                                        public List<String> getEmail() {
                                            if (email == null) {
                                                email = new ArrayList<String>();
                                            }
                                            return this.email;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneMobile"
                                    })
                                    public static class PhoneMobileList  implements Serializable {

                                        @XmlElement(name = "PhoneMobile", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneMobile;

                                        
                                        public long getPhoneMobile() {
                                            return phoneMobile;
                                        }

                                        
                                        public void setPhoneMobile(long value) {
                                            this.phoneMobile = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "rtContactInfo"
                            })
                            public static class RTContactInfoList  implements Serializable {

                                @XmlElement(name = "RTContactInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo rtContactInfo;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo getRTContactInfo() {
                                    return rtContactInfo;
                                }

                                
                                public void setRTContactInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo value) {
                                    this.rtContactInfo = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "location",
                                    "utcTimeOffset",
                                    "officeHours",
                                    "mainContact",
                                    "escalationContact",
                                    "ts24X7Contact"
                                })
                                public static class RTContactInfo  implements Serializable {

                                    @XmlElement(name = "Location", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String location;
                                    @XmlElement(name = "UTCTimeOffset", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String utcTimeOffset;
                                    @XmlElement(name = "OfficeHours", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours officeHours;
                                    @XmlElement(name = "MainContact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact mainContact;
                                    @XmlElement(name = "EscalationContact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact escalationContact;
                                    @XmlElement(name = "TS24x7Contact", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact ts24X7Contact;

                                    
                                    public String getLocation() {
                                        return location;
                                    }

                                    
                                    public void setLocation(String value) {
                                        this.location = value;
                                    }

                                    
                                    public String getUTCTimeOffset() {
                                        return utcTimeOffset;
                                    }

                                    
                                    public void setUTCTimeOffset(String value) {
                                        this.utcTimeOffset = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours getOfficeHours() {
                                        return officeHours;
                                    }

                                    
                                    public void setOfficeHours(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours value) {
                                        this.officeHours = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact getMainContact() {
                                        return mainContact;
                                    }

                                    
                                    public void setMainContact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact value) {
                                        this.mainContact = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact getEscalationContact() {
                                        return escalationContact;
                                    }

                                    
                                    public void setEscalationContact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact value) {
                                        this.escalationContact = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact getTS24X7Contact() {
                                        return ts24X7Contact;
                                    }

                                    
                                    public void setTS24X7Contact(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact value) {
                                        this.ts24X7Contact = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "prefix",
                                        "givenName",
                                        "familyName",
                                        "jobTitle",
                                        "phoneFixList",
                                        "faxList",
                                        "emailList"
                                    })
                                    public static class EscalationContact  implements Serializable {

                                        @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String prefix;
                                        @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String givenName;
                                        @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String familyName;
                                        @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String jobTitle;
                                        @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.PhoneFixList phoneFixList;
                                        @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.FaxList faxList;
                                        @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.EmailList emailList;

                                        
                                        public String getPrefix() {
                                            return prefix;
                                        }

                                        
                                        public void setPrefix(String value) {
                                            this.prefix = value;
                                        }

                                        
                                        public String getGivenName() {
                                            return givenName;
                                        }

                                        
                                        public void setGivenName(String value) {
                                            this.givenName = value;
                                        }

                                        
                                        public String getFamilyName() {
                                            return familyName;
                                        }

                                        
                                        public void setFamilyName(String value) {
                                            this.familyName = value;
                                        }

                                        
                                        public String getJobTitle() {
                                            return jobTitle;
                                        }

                                        
                                        public void setJobTitle(String value) {
                                            this.jobTitle = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.PhoneFixList getPhoneFixList() {
                                            return phoneFixList;
                                        }

                                        
                                        public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.PhoneFixList value) {
                                            this.phoneFixList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.FaxList getFaxList() {
                                            return faxList;
                                        }

                                        
                                        public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.FaxList value) {
                                            this.faxList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.EmailList getEmailList() {
                                            return emailList;
                                        }

                                        
                                        public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.EscalationContact.EmailList value) {
                                            this.emailList = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "email"
                                        })
                                        public static class EmailList  implements Serializable {

                                            @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String email;

                                            
                                            public String getEmail() {
                                                return email;
                                            }

                                            
                                            public void setEmail(String value) {
                                                this.email = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "fax"
                                        })
                                        public static class FaxList  implements Serializable {

                                            @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long fax;

                                            
                                            public long getFax() {
                                                return fax;
                                            }

                                            
                                            public void setFax(long value) {
                                                this.fax = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "phoneFix"
                                        })
                                        public static class PhoneFixList  implements Serializable {

                                            @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long phoneFix;

                                            
                                            public long getPhoneFix() {
                                                return phoneFix;
                                            }

                                            
                                            public void setPhoneFix(long value) {
                                                this.phoneFix = value;
                                            }

                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "teamName",
                                        "phoneFixList",
                                        "faxList",
                                        "emailList"
                                    })
                                    public static class MainContact  implements Serializable {

                                        @XmlElement(name = "TeamName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String teamName;
                                        @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.PhoneFixList phoneFixList;
                                        @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.FaxList faxList;
                                        @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.EmailList emailList;

                                        
                                        public String getTeamName() {
                                            return teamName;
                                        }

                                        
                                        public void setTeamName(String value) {
                                            this.teamName = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.PhoneFixList getPhoneFixList() {
                                            return phoneFixList;
                                        }

                                        
                                        public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.PhoneFixList value) {
                                            this.phoneFixList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.FaxList getFaxList() {
                                            return faxList;
                                        }

                                        
                                        public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.FaxList value) {
                                            this.faxList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.EmailList getEmailList() {
                                            return emailList;
                                        }

                                        
                                        public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.MainContact.EmailList value) {
                                            this.emailList = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "email"
                                        })
                                        public static class EmailList  implements Serializable {

                                            @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String email;

                                            
                                            public String getEmail() {
                                                return email;
                                            }

                                            
                                            public void setEmail(String value) {
                                                this.email = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "fax"
                                        })
                                        public static class FaxList  implements Serializable {

                                            @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long fax;

                                            
                                            public long getFax() {
                                                return fax;
                                            }

                                            
                                            public void setFax(long value) {
                                                this.fax = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "phoneFix"
                                        })
                                        public static class PhoneFixList  implements Serializable {

                                            @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long phoneFix;

                                            
                                            public long getPhoneFix() {
                                                return phoneFix;
                                            }

                                            
                                            public void setPhoneFix(long value) {
                                                this.phoneFix = value;
                                            }

                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "officeHour"
                                    })
                                    public static class OfficeHours  implements Serializable {

                                        @XmlElement(name = "OfficeHour", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour> officeHour;

                                        
                                        public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour> getOfficeHour() {
                                            if (officeHour == null) {
                                                officeHour = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour>();
                                            }
                                            return this.officeHour;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "startTime",
                                            "endTime",
                                            "inclusiveAllWeekDays",
                                            "weekDayList"
                                        })
                                        public static class OfficeHour  implements Serializable {

                                            @XmlElement(namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            @XmlSchemaType(name = "time")
                                            protected XMLGregorianCalendar startTime;
                                            @XmlElement(namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            @XmlSchemaType(name = "time")
                                            protected XMLGregorianCalendar endTime;
                                            @XmlElement(namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String inclusiveAllWeekDays;
                                            @XmlElement(name = "WeekDayList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour.WeekDayList weekDayList;

                                            
                                            public XMLGregorianCalendar getStartTime() {
                                                return startTime;
                                            }

                                            
                                            public void setStartTime(XMLGregorianCalendar value) {
                                                this.startTime = value;
                                            }

                                            
                                            public XMLGregorianCalendar getEndTime() {
                                                return endTime;
                                            }

                                            
                                            public void setEndTime(XMLGregorianCalendar value) {
                                                this.endTime = value;
                                            }

                                            
                                            public String getInclusiveAllWeekDays() {
                                                return inclusiveAllWeekDays;
                                            }

                                            
                                            public void setInclusiveAllWeekDays(String value) {
                                                this.inclusiveAllWeekDays = value;
                                            }

                                            
                                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour.WeekDayList getWeekDayList() {
                                                return weekDayList;
                                            }

                                            
                                            public void setWeekDayList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.OfficeHours.OfficeHour.WeekDayList value) {
                                                this.weekDayList = value;
                                            }


                                            
                                            @XmlAccessorType(XmlAccessType.FIELD)
                                            @XmlType(name = "", propOrder = {
                                                "weekDay"
                                            })
                                            public static class WeekDayList  implements Serializable {

                                                @XmlElement(name = "WeekDay", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                                protected List<String> weekDay;

                                                
                                                public List<String> getWeekDay() {
                                                    if (weekDay == null) {
                                                        weekDay = new ArrayList<String>();
                                                    }
                                                    return this.weekDay;
                                                }

                                            }

                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "teamName",
                                        "phoneFixList",
                                        "faxList",
                                        "emailList"
                                    })
                                    public static class TS24X7Contact  implements Serializable {

                                        @XmlElement(name = "TeamName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String teamName;
                                        @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.PhoneFixList phoneFixList;
                                        @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.FaxList faxList;
                                        @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.EmailList emailList;

                                        
                                        public String getTeamName() {
                                            return teamName;
                                        }

                                        
                                        public void setTeamName(String value) {
                                            this.teamName = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.PhoneFixList getPhoneFixList() {
                                            return phoneFixList;
                                        }

                                        
                                        public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.PhoneFixList value) {
                                            this.phoneFixList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.FaxList getFaxList() {
                                            return faxList;
                                        }

                                        
                                        public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.FaxList value) {
                                            this.faxList = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.EmailList getEmailList() {
                                            return emailList;
                                        }

                                        
                                        public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RTContactInfoList.RTContactInfo.TS24X7Contact.EmailList value) {
                                            this.emailList = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "email"
                                        })
                                        public static class EmailList  implements Serializable {

                                            @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String email;

                                            
                                            public String getEmail() {
                                                return email;
                                            }

                                            
                                            public void setEmail(String value) {
                                                this.email = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "fax"
                                        })
                                        public static class FaxList  implements Serializable {

                                            @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long fax;

                                            
                                            public long getFax() {
                                                return fax;
                                            }

                                            
                                            public void setFax(long value) {
                                                this.fax = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "phoneFix"
                                        })
                                        public static class PhoneFixList  implements Serializable {

                                            @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long phoneFix;

                                            
                                            public long getPhoneFix() {
                                                return phoneFix;
                                            }

                                            
                                            public void setPhoneFix(long value) {
                                                this.phoneFix = value;
                                            }

                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class RoamingCoordinator  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.RoamingCoordinator.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class SCCPInquiriesAndOrderingOfSS7Routes  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson contactPerson;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson getContactPerson() {
                                    return contactPerson;
                                }

                                
                                public void setContactPerson(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson value) {
                                    this.contactPerson = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.SCCPInquiriesAndOrderingOfSS7Routes.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList  implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class TADIGTests  implements Serializable {

                                @XmlElement(name = "ContactPerson", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson> contactPerson;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "prefix",
                                    "givenName",
                                    "familyName",
                                    "jobTitle",
                                    "phoneFixList",
                                    "faxList",
                                    "emailList"
                                })
                                public static class ContactPerson  implements Serializable {

                                    @XmlElement(name = "Prefix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String prefix;
                                    @XmlElement(name = "GivenName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String givenName;
                                    @XmlElement(name = "FamilyName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String familyName;
                                    @XmlElement(name = "JobTitle", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String jobTitle;
                                    @XmlElement(name = "PhoneFixList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.PhoneFixList phoneFixList;
                                    @XmlElement(name = "FaxList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.FaxList faxList;
                                    @XmlElement(name = "EmailList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.EmailList emailList;

                                    
                                    public String getPrefix() {
                                        return prefix;
                                    }

                                    
                                    public void setPrefix(String value) {
                                        this.prefix = value;
                                    }

                                    
                                    public String getGivenName() {
                                        return givenName;
                                    }

                                    
                                    public void setGivenName(String value) {
                                        this.givenName = value;
                                    }

                                    
                                    public String getFamilyName() {
                                        return familyName;
                                    }

                                    
                                    public void setFamilyName(String value) {
                                        this.familyName = value;
                                    }

                                    
                                    public String getJobTitle() {
                                        return jobTitle;
                                    }

                                    
                                    public void setJobTitle(String value) {
                                        this.jobTitle = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.PhoneFixList getPhoneFixList() {
                                        return phoneFixList;
                                    }

                                    
                                    public void setPhoneFixList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.PhoneFixList value) {
                                        this.phoneFixList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.FaxList getFaxList() {
                                        return faxList;
                                    }

                                    
                                    public void setFaxList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.FaxList value) {
                                        this.faxList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.EmailList getEmailList() {
                                        return emailList;
                                    }

                                    
                                    public void setEmailList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.ContactInfoSection.ContactInfo.TADIGTests.ContactPerson.EmailList value) {
                                        this.emailList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "email"
                                    })
                                    public static class EmailList  implements Serializable {

                                        @XmlElement(name = "Email", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String email;

                                        
                                        public String getEmail() {
                                            return email;
                                        }

                                        
                                        public void setEmail(String value) {
                                            this.email = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "fax"
                                    })
                                    public static class FaxList implements Serializable {

                                        @XmlElement(name = "Fax", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long fax;

                                        
                                        public long getFax() {
                                            return fax;
                                        }

                                        
                                        public void setFax(long value) {
                                            this.fax = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "phoneFix"
                                    })
                                    public static class PhoneFixList  implements Serializable {

                                        @XmlElement(name = "PhoneFix", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long phoneFix;

                                        
                                        public long getPhoneFix() {
                                            return phoneFix;
                                        }

                                        
                                        public void setPhoneFix(long value) {
                                            this.phoneFix = value;
                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sectionNA"
                    })
                    public static class DomesticSCCPGatewaySection  implements Serializable {

                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected String sectionNA;

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "ipRoamingIWInfo"
                    })
                    public static class IPRoamingIWInfoSection  implements Serializable {

                        @XmlElement(name = "IPRoaming_IW_Info", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo ipRoamingIWInfo;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo getIPRoamingIWInfo() {
                            return ipRoamingIWInfo;
                        }

                        
                        public void setIPRoamingIWInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo value) {
                            this.ipRoamingIWInfo = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "interPMNBackboneIPList",
                            "raiAdditionalMCCMNCList",
                            "asNsList",
                            "pmnAuthoritativeDNSIPList",
                            "pmnLocalDNSIPList",
                            "grxProvidersList",
                            "changeHistory"
                        })
                        public static class IPRoamingIWInfo implements Serializable  {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "InterPMNBackboneIPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList interPMNBackboneIPList;
                            @XmlElement(name = "RAI_AdditionalMCCMNCList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList raiAdditionalMCCMNCList;
                            @XmlElement(name = "ASNsList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ASNsList asNsList;
                            @XmlElement(name = "PMNAuthoritativeDNSIPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList pmnAuthoritativeDNSIPList;
                            @XmlElement(name = "PMNLocalDNSIPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList pmnLocalDNSIPList;
                            @XmlElement(name = "GRXProvidersList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.GRXProvidersList grxProvidersList;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList getInterPMNBackboneIPList() {
                                return interPMNBackboneIPList;
                            }

                            
                            public void setInterPMNBackboneIPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList value) {
                                this.interPMNBackboneIPList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList getRAIAdditionalMCCMNCList() {
                                return raiAdditionalMCCMNCList;
                            }

                            
                            public void setRAIAdditionalMCCMNCList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList value) {
                                this.raiAdditionalMCCMNCList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ASNsList getASNsList() {
                                return asNsList;
                            }

                            
                            public void setASNsList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ASNsList value) {
                                this.asNsList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList getPMNAuthoritativeDNSIPList() {
                                return pmnAuthoritativeDNSIPList;
                            }

                            
                            public void setPMNAuthoritativeDNSIPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList value) {
                                this.pmnAuthoritativeDNSIPList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList getPMNLocalDNSIPList() {
                                return pmnLocalDNSIPList;
                            }

                            
                            public void setPMNLocalDNSIPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList value) {
                                this.pmnLocalDNSIPList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.GRXProvidersList getGRXProvidersList() {
                                return grxProvidersList;
                            }

                            
                            public void setGRXProvidersList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.GRXProvidersList value) {
                                this.grxProvidersList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "asn"
                            })
                            public static class ASNsList  implements Serializable {

                                @XmlElement(name = "ASN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected int asn;

                                
                                public int getASN() {
                                    return asn;
                                }

                                
                                public void setASN(int value) {
                                    this.asn = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory  implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory.ChangeHistoryItem changeHistoryItem;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory.ChangeHistoryItem getChangeHistoryItem() {
                                    return changeHistoryItem;
                                }

                                
                                public void setChangeHistoryItem(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.ChangeHistory.ChangeHistoryItem value) {
                                    this.changeHistoryItem = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem  implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "grxProvider"
                            })
                            public static class GRXProvidersList  implements Serializable {

                                @XmlElement(name = "GRXProvider", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<String> grxProvider;

                                
                                public List<String> getGRXProvider() {
                                    if (grxProvider == null) {
                                        grxProvider = new ArrayList<String>();
                                    }
                                    return this.grxProvider;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "ipAddressOrRange"
                            })
                            public static class InterPMNBackboneIPList  implements Serializable {

                                @XmlElement(name = "IPAddressOrRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList.IPAddressOrRange> ipAddressOrRange;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList.IPAddressOrRange> getIPAddressOrRange() {
                                    if (ipAddressOrRange == null) {
                                        ipAddressOrRange = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.InterPMNBackboneIPList.IPAddressOrRange>();
                                    }
                                    return this.ipAddressOrRange;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "ipAddressRange"
                                })
                                public static class IPAddressOrRange  implements Serializable {

                                    @XmlElement(name = "IPAddressRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String ipAddressRange;

                                    
                                    public String getIPAddressRange() {
                                        return ipAddressRange;
                                    }

                                    
                                    public void setIPAddressRange(String value) {
                                        this.ipAddressRange = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "dnSitem"
                            })
                            public static class PMNAuthoritativeDNSIPList  implements Serializable {

                                @XmlElement(name = "DNSitem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList.DNSitem> dnSitem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList.DNSitem> getDNSitem() {
                                    if (dnSitem == null) {
                                        dnSitem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNAuthoritativeDNSIPList.DNSitem>();
                                    }
                                    return this.dnSitem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "ipAddress",
                                    "dnSname"
                                })
                                public static class DNSitem  implements Serializable {

                                    @XmlElement(name = "IPAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String ipAddress;
                                    @XmlElement(name = "DNSname", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String dnSname;

                                    
                                    public String getIPAddress() {
                                        return ipAddress;
                                    }

                                    
                                    public void setIPAddress(String value) {
                                        this.ipAddress = value;
                                    }

                                    
                                    public String getDNSname() {
                                        return dnSname;
                                    }

                                    
                                    public void setDNSname(String value) {
                                        this.dnSname = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "dnSitem"
                            })
                            public static class PMNLocalDNSIPList  implements Serializable {

                                @XmlElement(name = "DNSitem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList.DNSitem> dnSitem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList.DNSitem> getDNSitem() {
                                    if (dnSitem == null) {
                                        dnSitem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.PMNLocalDNSIPList.DNSitem>();
                                    }
                                    return this.dnSitem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "ipAddress",
                                    "dnSname"
                                })
                                public static class DNSitem  implements Serializable {

                                    @XmlElement(name = "IPAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String ipAddress;
                                    @XmlElement(name = "DNSname", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String dnSname;

                                    
                                    public String getIPAddress() {
                                        return ipAddress;
                                    }

                                    
                                    public void setIPAddress(String value) {
                                        this.ipAddress = value;
                                    }

                                    
                                    public String getDNSname() {
                                        return dnSname;
                                    }

                                    
                                    public void setDNSname(String value) {
                                        this.dnSname = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "ipRoamingIWAdditionalMCCMNCItem"
                            })
                            public static class RAIAdditionalMCCMNCList  implements Serializable {

                                @XmlElement(name = "IPRoamingIWAdditionalMCCMNCItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList.IPRoamingIWAdditionalMCCMNCItem ipRoamingIWAdditionalMCCMNCItem;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList.IPRoamingIWAdditionalMCCMNCItem getIPRoamingIWAdditionalMCCMNCItem() {
                                    return ipRoamingIWAdditionalMCCMNCItem;
                                }

                                
                                public void setIPRoamingIWAdditionalMCCMNCItem(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.IPRoamingIWInfoSection.IPRoamingIWInfo.RAIAdditionalMCCMNCList.IPRoamingIWAdditionalMCCMNCItem value) {
                                    this.ipRoamingIWAdditionalMCCMNCItem = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "mcc",
                                    "mnc"
                                })
                                public static class IPRoamingIWAdditionalMCCMNCItem  implements Serializable {

                                    @XmlElement(name = "MCC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected short mcc;
                                    @XmlElement(name = "MNC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String mnc;

                                    
                                    public short getMCC() {
                                        return mcc;
                                    }

                                    
                                    public void setMCC(short value) {
                                        this.mcc = value;
                                    }

                                    
                                    public String getMNC() {
                                        return mnc;
                                    }

                                    
                                    public void setMNC(String value) {
                                        this.mnc = value;
                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "internationalSCCPGatewayInfo",
                        "sectionNA"
                    })
                    public static class InternationalSCCPGatewaySection  implements Serializable {

                        @XmlElement(name = "InternationalSCCPGatewayInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo internationalSCCPGatewayInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo getInternationalSCCPGatewayInfo() {
                            return internationalSCCPGatewayInfo;
                        }

                        
                        public void setInternationalSCCPGatewayInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo value) {
                            this.internationalSCCPGatewayInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "internationalSCCPCarrierList",
                            "changeHistory"
                        })
                        public static class InternationalSCCPGatewayInfo  implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "InternationalSCCPCarrierList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList internationalSCCPCarrierList;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList getInternationalSCCPCarrierList() {
                                return internationalSCCPCarrierList;
                            }

                            
                            public void setInternationalSCCPCarrierList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList value) {
                                this.internationalSCCPCarrierList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory  implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem  implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "sccpCarrierItem"
                            })
                            public static class InternationalSCCPCarrierList  implements Serializable {

                                @XmlElement(name = "SCCPCarrierItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem sccpCarrierItem;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem getSCCPCarrierItem() {
                                    return sccpCarrierItem;
                                }

                                
                                public void setSCCPCarrierItem(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem value) {
                                    this.sccpCarrierItem = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sccpCarrierName",
                                    "sccpConnectivityInformation",
                                    "sccpCarrierComments",
                                    "sccpmnOsTADIGCodeList",
                                    "dpcList"
                                })
                                public static class SCCPCarrierItem  implements Serializable {

                                    @XmlElement(name = "SCCPCarrierName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String sccpCarrierName;
                                    @XmlElement(name = "SCCPConnectivityInformation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String sccpConnectivityInformation;
                                    @XmlElement(name = "SCCPCarrierComments", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String sccpCarrierComments;
                                    @XmlElement(name = "SCCPMNOsTADIGCodeList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String sccpmnOsTADIGCodeList;
                                    @XmlElement(name = "DPCList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList dpcList;

                                    
                                    public String getSCCPCarrierName() {
                                        return sccpCarrierName;
                                    }

                                    
                                    public void setSCCPCarrierName(String value) {
                                        this.sccpCarrierName = value;
                                    }

                                    
                                    public String getSCCPConnectivityInformation() {
                                        return sccpConnectivityInformation;
                                    }

                                    
                                    public void setSCCPConnectivityInformation(String value) {
                                        this.sccpConnectivityInformation = value;
                                    }

                                    
                                    public String getSCCPCarrierComments() {
                                        return sccpCarrierComments;
                                    }

                                    
                                    public void setSCCPCarrierComments(String value) {
                                        this.sccpCarrierComments = value;
                                    }

                                    
                                    public String getSCCPMNOsTADIGCodeList() {
                                        return sccpmnOsTADIGCodeList;
                                    }

                                    
                                    public void setSCCPMNOsTADIGCodeList(String value) {
                                        this.sccpmnOsTADIGCodeList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList getDPCList() {
                                        return dpcList;
                                    }

                                    
                                    public void setDPCList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList value) {
                                        this.dpcList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "dpcItem"
                                    })
                                    public static class DPCList  implements Serializable {

                                        @XmlElement(name = "DPCItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList.DPCItem> dpcItem;

                                        
                                        public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList.DPCItem> getDPCItem() {
                                            if (dpcItem == null) {
                                                dpcItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.InternationalSCCPGatewaySection.InternationalSCCPGatewayInfo.InternationalSCCPCarrierList.SCCPCarrierItem.DPCList.DPCItem>();
                                            }
                                            return this.dpcItem;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "scSignature",
                                            "scType",
                                            "dpc"
                                        })
                                        public static class DPCItem  implements Serializable {

                                            @XmlElement(name = "SCSignature", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String scSignature;
                                            @XmlElement(name = "SCType", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String scType;
                                            @XmlElement(name = "DPC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String dpc;

                                            
                                            public String getSCSignature() {
                                                return scSignature;
                                            }

                                            
                                            public void setSCSignature(String value) {
                                                this.scSignature = value;
                                            }

                                            
                                            public String getSCType() {
                                                return scType;
                                            }

                                            
                                            public void setSCType(String value) {
                                                this.scType = value;
                                            }

                                            
                                            public String getDPC() {
                                                return dpc;
                                            }

                                            
                                            public void setDPC(String value) {
                                                this.dpc = value;
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "lteInfo",
                        "sectionNA"
                    })
                    public static class LTEInfoSection  implements Serializable {

                        @XmlElement(name = "LTEInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo lteInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo getLTEInfo() {
                            return lteInfo;
                        }

                        
                        public void setLTEInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo value) {
                            this.lteInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "roamingInterconnection",
                            "smsitw",
                            "voiceITW",
                            "roamingRetry",
                            "hpmnInfoLTERoamingAgreementOnly",
                            "vpmnInfoLTERoamingAgreementOnly",
                            "hpmnInfo2G3GRoamingAgreementOnly",
                            "vpmnInfo2G3GRoamingAgreementOnly",
                            "hpmnInfo2G3GLTERoamingAgreement",
                            "vpmnInfo2G3GLTERoamingAgreement",
                            "lteQosProfileList",
                            "iPv6ConnectivityInformation",
                            "diameterCertificatesExchange",
                            "lteInformation",
                            "changeHistory"
                        })
                        public static class LTEInfo  implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "RoamingInterconnection", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection roamingInterconnection;
                            @XmlElement(name = "SMS_ITW", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW smsitw;
                            @XmlElement(name = "Voice_ITW", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected String voiceITW;
                            @XmlElement(name = "RoamingRetry", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingRetry roamingRetry;
                            @XmlElement(name = "HPMNInfoLTERoamingAgreementOnly", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfoLTERoamingAgreementOnly hpmnInfoLTERoamingAgreementOnly;
                            @XmlElement(name = "VPMNInfoLTERoamingAgreementOnly", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfoLTERoamingAgreementOnly vpmnInfoLTERoamingAgreementOnly;
                            @XmlElement(name = "HPMNInfo2G3GRoamingAgreementOnly", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GRoamingAgreementOnly hpmnInfo2G3GRoamingAgreementOnly;
                            @XmlElement(name = "VPMNInfo2G3GRoamingAgreementOnly", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GRoamingAgreementOnly vpmnInfo2G3GRoamingAgreementOnly;
                            @XmlElement(name = "HPMNInfo2G3GLTERoamingAgreement", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GLTERoamingAgreement hpmnInfo2G3GLTERoamingAgreement;
                            @XmlElement(name = "VPMNInfo2G3GLTERoamingAgreement", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GLTERoamingAgreement vpmnInfo2G3GLTERoamingAgreement;
                            @XmlElement(name = "LTEQosProfileList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList lteQosProfileList;
                            @XmlElement(name = "IPv6ConnectivityInformation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation iPv6ConnectivityInformation;
                            @XmlElement(name = "DiameterCertificatesExchange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.DiameterCertificatesExchange diameterCertificatesExchange;
                            @XmlElement(name = "LTEInformation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEInformation lteInformation;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection getRoamingInterconnection() {
                                return roamingInterconnection;
                            }

                            
                            public void setRoamingInterconnection(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection value) {
                                this.roamingInterconnection = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW getSMSITW() {
                                return smsitw;
                            }

                            
                            public void setSMSITW(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW value) {
                                this.smsitw = value;
                            }

                            
                            public String getVoiceITW() {
                                return voiceITW;
                            }

                            
                            public void setVoiceITW(String value) {
                                this.voiceITW = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingRetry getRoamingRetry() {
                                return roamingRetry;
                            }

                            
                            public void setRoamingRetry(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingRetry value) {
                                this.roamingRetry = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfoLTERoamingAgreementOnly getHPMNInfoLTERoamingAgreementOnly() {
                                return hpmnInfoLTERoamingAgreementOnly;
                            }

                            
                            public void setHPMNInfoLTERoamingAgreementOnly(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfoLTERoamingAgreementOnly value) {
                                this.hpmnInfoLTERoamingAgreementOnly = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfoLTERoamingAgreementOnly getVPMNInfoLTERoamingAgreementOnly() {
                                return vpmnInfoLTERoamingAgreementOnly;
                            }

                            
                            public void setVPMNInfoLTERoamingAgreementOnly(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfoLTERoamingAgreementOnly value) {
                                this.vpmnInfoLTERoamingAgreementOnly = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GRoamingAgreementOnly getHPMNInfo2G3GRoamingAgreementOnly() {
                                return hpmnInfo2G3GRoamingAgreementOnly;
                            }

                            
                            public void setHPMNInfo2G3GRoamingAgreementOnly(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GRoamingAgreementOnly value) {
                                this.hpmnInfo2G3GRoamingAgreementOnly = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GRoamingAgreementOnly getVPMNInfo2G3GRoamingAgreementOnly() {
                                return vpmnInfo2G3GRoamingAgreementOnly;
                            }

                            
                            public void setVPMNInfo2G3GRoamingAgreementOnly(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GRoamingAgreementOnly value) {
                                this.vpmnInfo2G3GRoamingAgreementOnly = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GLTERoamingAgreement getHPMNInfo2G3GLTERoamingAgreement() {
                                return hpmnInfo2G3GLTERoamingAgreement;
                            }

                            
                            public void setHPMNInfo2G3GLTERoamingAgreement(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.HPMNInfo2G3GLTERoamingAgreement value) {
                                this.hpmnInfo2G3GLTERoamingAgreement = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GLTERoamingAgreement getVPMNInfo2G3GLTERoamingAgreement() {
                                return vpmnInfo2G3GLTERoamingAgreement;
                            }

                            
                            public void setVPMNInfo2G3GLTERoamingAgreement(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.VPMNInfo2G3GLTERoamingAgreement value) {
                                this.vpmnInfo2G3GLTERoamingAgreement = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList getLTEQosProfileList() {
                                return lteQosProfileList;
                            }

                            
                            public void setLTEQosProfileList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList value) {
                                this.lteQosProfileList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation getIPv6ConnectivityInformation() {
                                return iPv6ConnectivityInformation;
                            }

                            
                            public void setIPv6ConnectivityInformation(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation value) {
                                this.iPv6ConnectivityInformation = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.DiameterCertificatesExchange getDiameterCertificatesExchange() {
                                return diameterCertificatesExchange;
                            }

                            
                            public void setDiameterCertificatesExchange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.DiameterCertificatesExchange value) {
                                this.diameterCertificatesExchange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEInformation getLTEInformation() {
                                return lteInformation;
                            }

                            
                            public void setLTEInformation(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEInformation value) {
                                this.lteInformation = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory  implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem  implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "ipAddressIPSecGW",
                                "certificateIPSecGW"
                            })
                            public static class DiameterCertificatesExchange  implements Serializable {

                                @XmlElement(name = "IPAddressIPSecGW", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String ipAddressIPSecGW;
                                @XmlElement(name = "CertificateIPSecGW", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String certificateIPSecGW;

                                
                                public String getIPAddressIPSecGW() {
                                    return ipAddressIPSecGW;
                                }

                                
                                public void setIPAddressIPSecGW(String value) {
                                    this.ipAddressIPSecGW = value;
                                }

                                
                                public String getCertificateIPSecGW() {
                                    return certificateIPSecGW;
                                }

                                
                                public void setCertificateIPSecGW(String value) {
                                    this.certificateIPSecGW = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isScenario1Supported",
                                "isScenario2Supported",
                                "isScenario3Supported",
                                "isScenario4Supported"
                            })
                            public static class HPMNInfo2G3GLTERoamingAgreement  implements Serializable {

                                @XmlElement(name = "IsScenario1Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario1Supported;
                                @XmlElement(name = "IsScenario2Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario2Supported;
                                @XmlElement(name = "IsScenario3Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario3Supported;
                                @XmlElement(name = "IsScenario4Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario4Supported;

                                
                                public String getIsScenario1Supported() {
                                    return isScenario1Supported;
                                }

                                
                                public void setIsScenario1Supported(String value) {
                                    this.isScenario1Supported = value;
                                }

                                
                                public String getIsScenario2Supported() {
                                    return isScenario2Supported;
                                }

                                
                                public void setIsScenario2Supported(String value) {
                                    this.isScenario2Supported = value;
                                }

                                
                                public String getIsScenario3Supported() {
                                    return isScenario3Supported;
                                }

                                
                                public void setIsScenario3Supported(String value) {
                                    this.isScenario3Supported = value;
                                }

                                
                                public String getIsScenario4Supported() {
                                    return isScenario4Supported;
                                }

                                
                                public void setIsScenario4Supported(String value) {
                                    this.isScenario4Supported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isScenario2Supported",
                                "isScenario3Supported"
                            })
                            public static class HPMNInfo2G3GRoamingAgreementOnly  implements Serializable {

                                @XmlElement(name = "IsScenario2Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario2Supported;
                                @XmlElement(name = "IsScenario3Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario3Supported;

                                
                                public String getIsScenario2Supported() {
                                    return isScenario2Supported;
                                }

                                
                                public void setIsScenario2Supported(String value) {
                                    this.isScenario2Supported = value;
                                }

                                
                                public String getIsScenario3Supported() {
                                    return isScenario3Supported;
                                }

                                
                                public void setIsScenario3Supported(String value) {
                                    this.isScenario3Supported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isLTEOnlyRoamingSupported"
                            })
                            public static class HPMNInfoLTERoamingAgreementOnly  implements Serializable {

                                @XmlElement(name = "IsLTEOnlyRoamingSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isLTEOnlyRoamingSupported;

                                
                                public String getIsLTEOnlyRoamingSupported() {
                                    return isLTEOnlyRoamingSupported;
                                }

                                
                                public void setIsLTEOnlyRoamingSupported(String value) {
                                    this.isLTEOnlyRoamingSupported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "mmeSupport",
                                "sgwSupport",
                                "pgwSupport"
                            })
                            public static class IPv6ConnectivityInformation  implements Serializable {

                                @XmlElement(name = "MMESupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.MMESupport mmeSupport;
                                @XmlElement(name = "SGWSupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.SGWSupport sgwSupport;
                                @XmlElement(name = "PGWSupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.PGWSupport pgwSupport;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.MMESupport getMMESupport() {
                                    return mmeSupport;
                                }

                                
                                public void setMMESupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.MMESupport value) {
                                    this.mmeSupport = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.SGWSupport getSGWSupport() {
                                    return sgwSupport;
                                }

                                
                                public void setSGWSupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.SGWSupport value) {
                                    this.sgwSupport = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.PGWSupport getPGWSupport() {
                                    return pgwSupport;
                                }

                                
                                public void setPGWSupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.IPv6ConnectivityInformation.PGWSupport value) {
                                    this.pgwSupport = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "iPv6PDPSupported",
                                    "iPv4V6PDPSupported"
                                })
                                public static class MMESupport  implements Serializable {

                                    @XmlElement(name = "IPv6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv6PDPSupported;
                                    @XmlElement(name = "IPv4v6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv4V6PDPSupported;

                                    
                                    public String getIPv6PDPSupported() {
                                        return iPv6PDPSupported;
                                    }

                                    
                                    public void setIPv6PDPSupported(String value) {
                                        this.iPv6PDPSupported = value;
                                    }

                                    
                                    public String getIPv4V6PDPSupported() {
                                        return iPv4V6PDPSupported;
                                    }

                                    
                                    public void setIPv4V6PDPSupported(String value) {
                                        this.iPv4V6PDPSupported = value;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "iPv6PDPSupported",
                                    "iPv4V6PDPSupported"
                                })
                                public static class PGWSupport  implements Serializable {

                                    @XmlElement(name = "IPv6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv6PDPSupported;
                                    @XmlElement(name = "IPv4v6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv4V6PDPSupported;

                                    
                                    public String getIPv6PDPSupported() {
                                        return iPv6PDPSupported;
                                    }

                                    
                                    public void setIPv6PDPSupported(String value) {
                                        this.iPv6PDPSupported = value;
                                    }

                                    
                                    public String getIPv4V6PDPSupported() {
                                        return iPv4V6PDPSupported;
                                    }

                                    
                                    public void setIPv4V6PDPSupported(String value) {
                                        this.iPv4V6PDPSupported = value;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "iPv6PDPSupported",
                                    "iPv4V6PDPSupported"
                                })
                                public static class SGWSupport  implements Serializable {

                                    @XmlElement(name = "IPv6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv6PDPSupported;
                                    @XmlElement(name = "IPv4v6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv4V6PDPSupported;

                                    
                                    public String getIPv6PDPSupported() {
                                        return iPv6PDPSupported;
                                    }

                                    
                                    public void setIPv6PDPSupported(String value) {
                                        this.iPv6PDPSupported = value;
                                    }

                                    
                                    public String getIPv4V6PDPSupported() {
                                        return iPv4V6PDPSupported;
                                    }

                                    
                                    public void setIPv4V6PDPSupported(String value) {
                                        this.iPv4V6PDPSupported = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "qciValue1Supported",
                                "qciValue2Supported",
                                "qciValue3Supported",
                                "qciValue4Supported",
                                "qciValue5Supported",
                                "qciValue6Supported",
                                "qciValue7Supported",
                                "qciValue8Supported",
                                "qciValue9Supported"
                            })
                            public static class LTEInformation  implements Serializable {

                                @XmlElement(name = "QCIValue1Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue1Supported;
                                @XmlElement(name = "QCIValue2Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue2Supported;
                                @XmlElement(name = "QCIValue3Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue3Supported;
                                @XmlElement(name = "QCIValue4Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue4Supported;
                                @XmlElement(name = "QCIValue5Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue5Supported;
                                @XmlElement(name = "QCIValue6Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue6Supported;
                                @XmlElement(name = "QCIValue7Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue7Supported;
                                @XmlElement(name = "QCIValue8Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue8Supported;
                                @XmlElement(name = "QCIValue9Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String qciValue9Supported;

                                
                                public String getQCIValue1Supported() {
                                    return qciValue1Supported;
                                }

                                
                                public void setQCIValue1Supported(String value) {
                                    this.qciValue1Supported = value;
                                }

                                
                                public String getQCIValue2Supported() {
                                    return qciValue2Supported;
                                }

                                
                                public void setQCIValue2Supported(String value) {
                                    this.qciValue2Supported = value;
                                }

                                
                                public String getQCIValue3Supported() {
                                    return qciValue3Supported;
                                }

                                
                                public void setQCIValue3Supported(String value) {
                                    this.qciValue3Supported = value;
                                }

                                
                                public String getQCIValue4Supported() {
                                    return qciValue4Supported;
                                }

                                
                                public void setQCIValue4Supported(String value) {
                                    this.qciValue4Supported = value;
                                }

                                
                                public String getQCIValue5Supported() {
                                    return qciValue5Supported;
                                }

                                
                                public void setQCIValue5Supported(String value) {
                                    this.qciValue5Supported = value;
                                }

                                
                                public String getQCIValue6Supported() {
                                    return qciValue6Supported;
                                }

                                
                                public void setQCIValue6Supported(String value) {
                                    this.qciValue6Supported = value;
                                }

                                
                                public String getQCIValue7Supported() {
                                    return qciValue7Supported;
                                }

                                
                                public void setQCIValue7Supported(String value) {
                                    this.qciValue7Supported = value;
                                }

                                
                                public String getQCIValue8Supported() {
                                    return qciValue8Supported;
                                }

                                
                                public void setQCIValue8Supported(String value) {
                                    this.qciValue8Supported = value;
                                }

                                
                                public String getQCIValue9Supported() {
                                    return qciValue9Supported;
                                }

                                
                                public void setQCIValue9Supported(String value) {
                                    this.qciValue9Supported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "lteQosProfile"
                            })
                            public static class LTEQosProfileList  implements Serializable {

                                @XmlElement(name = "LTEQosProfile", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile> lteQosProfile;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile> getLTEQosProfile() {
                                    if (lteQosProfile == null) {
                                        lteQosProfile = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile>();
                                    }
                                    return this.lteQosProfile;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "profile",
                                    "qciValue",
                                    "qosarpList"
                                })
                                public static class LTEQosProfile  implements Serializable {

                                    @XmlElement(name = "Profile", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String profile;
                                    @XmlElement(name = "QCIValue", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String qciValue;
                                    @XmlElement(name = "QOSARPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile.QOSARPList qosarpList;

                                    
                                    public String getProfile() {
                                        return profile;
                                    }

                                    
                                    public void setProfile(String value) {
                                        this.profile = value;
                                    }

                                    
                                    public String getQCIValue() {
                                        return qciValue;
                                    }

                                    
                                    public void setQCIValue(String value) {
                                        this.qciValue = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile.QOSARPList getQOSARPList() {
                                        return qosarpList;
                                    }

                                    
                                    public void setQOSARPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.LTEQosProfileList.LTEQosProfile.QOSARPList value) {
                                        this.qosarpList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "arp"
                                    })
                                    public static class QOSARPList  implements Serializable {

                                        @XmlElement(name = "ARP", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String arp;

                                        
                                        public String getARP() {
                                            return arp;
                                        }

                                        
                                        public void setARP(String value) {
                                            this.arp = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "ipAddressesDiameterEdgeAgent",
                                "s6A",
                                "s6D",
                                "s9",
                                "s8"
                            })
                            public static class RoamingInterconnection  implements Serializable {

                                @XmlElement(name = "IPAddressesDiameterEdgeAgent", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.IPAddressesDiameterEdgeAgent ipAddressesDiameterEdgeAgent;
                                @XmlElement(name = "S6a", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A s6A;
                                @XmlElement(name = "S6d", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6D s6D;
                                @XmlElement(name = "S9", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 s9;
                                @XmlElement(name = "S8", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S8 s8;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.IPAddressesDiameterEdgeAgent getIPAddressesDiameterEdgeAgent() {
                                    return ipAddressesDiameterEdgeAgent;
                                }

                                
                                public void setIPAddressesDiameterEdgeAgent(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.IPAddressesDiameterEdgeAgent value) {
                                    this.ipAddressesDiameterEdgeAgent = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A getS6A() {
                                    return s6A;
                                }

                                
                                public void setS6A(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A value) {
                                    this.s6A = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6D getS6D() {
                                    return s6D;
                                }

                                
                                public void setS6D(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6D value) {
                                    this.s6D = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 getS9() {
                                    return s9;
                                }

                                
                                public void setS9(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 value) {
                                    this.s9 = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S8 getS8() {
                                    return s8;
                                }

                                
                                public void setS8(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S8 value) {
                                    this.s8 = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "ipAddress"
                                })
                                public static class IPAddressesDiameterEdgeAgent  implements Serializable {

                                    @XmlElement(name = "IPAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected List<String> ipAddress;

                                    
                                    public List<String> getIPAddress() {
                                        if (ipAddress == null) {
                                            ipAddress = new ArrayList<String>();
                                        }
                                        return this.ipAddress;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "isS6ASupportedWithoutIWF",
                                    "hostnamesHSSMMEList",
                                    "isMAPIWFsupportedToHSS",
                                    "isMAPIWFsupportedToMME"
                                })
                                public static class S6A  implements Serializable {

                                    @XmlElement(name = "IsS6aSupportedWithoutIWF", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isS6ASupportedWithoutIWF;
                                    @XmlElement(name = "HostnamesHSS_MMEList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A.HostnamesHSSMMEList hostnamesHSSMMEList;
                                    @XmlElement(name = "IsMAP_IWFsupportedToHSS", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isMAPIWFsupportedToHSS;
                                    @XmlElement(name = "IsMAP_IWFsupportedToMME", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isMAPIWFsupportedToMME;

                                    
                                    public String getIsS6ASupportedWithoutIWF() {
                                        return isS6ASupportedWithoutIWF;
                                    }

                                    
                                    public void setIsS6ASupportedWithoutIWF(String value) {
                                        this.isS6ASupportedWithoutIWF = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A.HostnamesHSSMMEList getHostnamesHSSMMEList() {
                                        return hostnamesHSSMMEList;
                                    }

                                    
                                    public void setHostnamesHSSMMEList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S6A.HostnamesHSSMMEList value) {
                                        this.hostnamesHSSMMEList = value;
                                    }

                                    
                                    public String getIsMAPIWFsupportedToHSS() {
                                        return isMAPIWFsupportedToHSS;
                                    }

                                    
                                    public void setIsMAPIWFsupportedToHSS(String value) {
                                        this.isMAPIWFsupportedToHSS = value;
                                    }

                                    
                                    public String getIsMAPIWFsupportedToMME() {
                                        return isMAPIWFsupportedToMME;
                                    }

                                    
                                    public void setIsMAPIWFsupportedToMME(String value) {
                                        this.isMAPIWFsupportedToMME = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "hostName"
                                    })
                                    public static class HostnamesHSSMMEList  implements Serializable {

                                        @XmlElement(name = "HostName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String hostName;

                                        
                                        public String getHostName() {
                                            return hostName;
                                        }

                                        
                                        public void setHostName(String value) {
                                            this.hostName = value;
                                        }

                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "isS6DUsedForLegacySGSN"
                                })
                                public static class S6D  implements Serializable {

                                    @XmlElement(name = "IsS6dUsedForLegacySGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isS6DUsedForLegacySGSN;

                                    
                                    public String getIsS6DUsedForLegacySGSN() {
                                        return isS6DUsedForLegacySGSN;
                                    }

                                    
                                    public void setIsS6DUsedForLegacySGSN(String value) {
                                        this.isS6DUsedForLegacySGSN = value;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "isGTPinterfaceAvailable",
                                    "isPMIPinterfaceAvailable"
                                })
                                public static class S8  implements Serializable {

                                    @XmlElement(name = "IsGTPinterfaceAvailable", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isGTPinterfaceAvailable;
                                    @XmlElement(name = "IsPMIPinterfaceAvailable", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isPMIPinterfaceAvailable;

                                    
                                    public String getIsGTPinterfaceAvailable() {
                                        return isGTPinterfaceAvailable;
                                    }

                                    
                                    public void setIsGTPinterfaceAvailable(String value) {
                                        this.isGTPinterfaceAvailable = value;
                                    }

                                    
                                    public String getIsPMIPinterfaceAvailable() {
                                        return isPMIPinterfaceAvailable;
                                    }

                                    
                                    public void setIsPMIPinterfaceAvailable(String value) {
                                        this.isPMIPinterfaceAvailable = value;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "isS9UsedForPCC",
                                    "hostnamesPCRFList"
                                })
                                public static class S9  implements Serializable {

                                    @XmlElement(name = "IsS9usedForPCC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String isS9UsedForPCC;
                                    @XmlElement(name = "HostnamesPCRFList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 .HostnamesPCRFList hostnamesPCRFList;

                                    
                                    public String getIsS9UsedForPCC() {
                                        return isS9UsedForPCC;
                                    }

                                    
                                    public void setIsS9UsedForPCC(String value) {
                                        this.isS9UsedForPCC = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 .HostnamesPCRFList getHostnamesPCRFList() {
                                        return hostnamesPCRFList;
                                    }

                                    
                                    public void setHostnamesPCRFList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.RoamingInterconnection.S9 .HostnamesPCRFList value) {
                                        this.hostnamesPCRFList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "hostName"
                                    })
                                    public static class HostnamesPCRFList  implements Serializable {

                                        @XmlElement(name = "HostName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String hostName;

                                        
                                        public String getHostName() {
                                            return hostName;
                                        }

                                        
                                        public void setHostName(String value) {
                                            this.hostName = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isRoamingRetrySupported"
                            })
                            public static class RoamingRetry  implements Serializable {

                                @XmlElement(name = "IsRoamingRetrySupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isRoamingRetrySupported;

                                
                                public String getIsRoamingRetrySupported() {
                                    return isRoamingRetrySupported;
                                }

                                
                                public void setIsRoamingRetrySupported(String value) {
                                    this.isRoamingRetrySupported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "smsDeliveryMechanisms"
                            })
                            public static class SMSITW  implements Serializable {

                                @XmlElement(name = "SMS_DeliveryMechanisms", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW.SMSDeliveryMechanisms smsDeliveryMechanisms;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW.SMSDeliveryMechanisms getSMSDeliveryMechanisms() {
                                    return smsDeliveryMechanisms;
                                }

                                
                                public void setSMSDeliveryMechanisms(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.LTEInfoSection.LTEInfo.SMSITW.SMSDeliveryMechanisms value) {
                                    this.smsDeliveryMechanisms = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "smSoverIP",
                                    "smSoverSGs"
                                })
                                public static class SMSDeliveryMechanisms  implements Serializable {

                                    @XmlElement(name = "SMSoverIP", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String smSoverIP;
                                    @XmlElement(name = "SMSoverSGs", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String smSoverSGs;

                                    
                                    public String getSMSoverIP() {
                                        return smSoverIP;
                                    }

                                    
                                    public void setSMSoverIP(String value) {
                                        this.smSoverIP = value;
                                    }

                                    
                                    public String getSMSoverSGs() {
                                        return smSoverSGs;
                                    }

                                    
                                    public void setSMSoverSGs(String value) {
                                        this.smSoverSGs = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isScenario1Supported",
                                "isScenario2Supported",
                                "isScenario3Supported",
                                "isScenario4Supported"
                            })
                            public static class VPMNInfo2G3GLTERoamingAgreement  implements Serializable {

                                @XmlElement(name = "IsScenario1Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario1Supported;
                                @XmlElement(name = "IsScenario2Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario2Supported;
                                @XmlElement(name = "IsScenario3Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario3Supported;
                                @XmlElement(name = "IsScenario4Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario4Supported;

                                
                                public String getIsScenario1Supported() {
                                    return isScenario1Supported;
                                }

                                
                                public void setIsScenario1Supported(String value) {
                                    this.isScenario1Supported = value;
                                }

                                
                                public String getIsScenario2Supported() {
                                    return isScenario2Supported;
                                }

                                
                                public void setIsScenario2Supported(String value) {
                                    this.isScenario2Supported = value;
                                }

                                
                                public String getIsScenario3Supported() {
                                    return isScenario3Supported;
                                }

                                
                                public void setIsScenario3Supported(String value) {
                                    this.isScenario3Supported = value;
                                }

                                
                                public String getIsScenario4Supported() {
                                    return isScenario4Supported;
                                }

                                
                                public void setIsScenario4Supported(String value) {
                                    this.isScenario4Supported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isScenario2Supported",
                                "isScenario3Supported"
                            })
                            public static class VPMNInfo2G3GRoamingAgreementOnly  implements Serializable {

                                @XmlElement(name = "IsScenario2Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario2Supported;
                                @XmlElement(name = "IsScenario3Supported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isScenario3Supported;

                                
                                public String getIsScenario2Supported() {
                                    return isScenario2Supported;
                                }

                                
                                public void setIsScenario2Supported(String value) {
                                    this.isScenario2Supported = value;
                                }

                                
                                public String getIsScenario3Supported() {
                                    return isScenario3Supported;
                                }

                                
                                public void setIsScenario3Supported(String value) {
                                    this.isScenario3Supported = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "isLTEOnlyRoamingSupported"
                            })
                            public static class VPMNInfoLTERoamingAgreementOnly  implements Serializable {

                                @XmlElement(name = "IsLTEOnlyRoamingSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String isLTEOnlyRoamingSupported;

                                
                                public String getIsLTEOnlyRoamingSupported() {
                                    return isLTEOnlyRoamingSupported;
                                }

                                
                                public void setIsLTEOnlyRoamingSupported(String value) {
                                    this.isLTEOnlyRoamingSupported = value;
                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "mapGeneralInfo",
                        "sectionNA"
                    })
                    public static class MAPGeneralInfoSection  implements Serializable {

                        @XmlElement(name = "MAPGeneralInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo mapGeneralInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo getMAPGeneralInfo() {
                            return mapGeneralInfo;
                        }

                        
                        public void setMAPGeneralInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo value) {
                            this.mapGeneralInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "networkLocUp",
                            "roamingNumberEnquiry",
                            "infoRetrieval",
                            "subscriberDataMngt",
                            "networkFunctionalSs",
                            "mwdMngt",
                            "shortMsgMTRelay",
                            "shortMsgMORelay",
                            "ssInvocationNotification",
                            "subscriberInfoEnquiry",
                            "gprsLocationUpdate",
                            "locationCancellation",
                            "msPurging",
                            "reset",
                            "networkUnstructuredSs",
                            "reporting",
                            "callCompletion",
                            "istAlerting",
                            "serviceTermination",
                            "locationSvcGateway",
                            "mmEventReporting",
                            "authenticationFailureReport",
                            "imsiRetrieval",
                            "gprsNotifyContext",
                            "gprsLocationInfoRetrieval",
                            "failureReport",
                            "secureTransportHandling"
                        })
                        public static class MAPGeneralInfo  implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "NetworkLocUp", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkLocUp networkLocUp;
                            @XmlElement(name = "RoamingNumberEnquiry", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.RoamingNumberEnquiry roamingNumberEnquiry;
                            @XmlElement(name = "InfoRetrieval", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.InfoRetrieval infoRetrieval;
                            @XmlElement(name = "SubscriberDataMngt", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberDataMngt subscriberDataMngt;
                            @XmlElement(name = "NetworkFunctionalSs", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkFunctionalSs networkFunctionalSs;
                            @XmlElement(name = "MwdMngt", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MwdMngt mwdMngt;
                            @XmlElement(name = "ShortMsgMTRelay", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMTRelay shortMsgMTRelay;
                            @XmlElement(name = "ShortMsgMORelay", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMORelay shortMsgMORelay;
                            @XmlElement(name = "SsInvocationNotification", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SsInvocationNotification ssInvocationNotification;
                            @XmlElement(name = "SubscriberInfoEnquiry", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberInfoEnquiry subscriberInfoEnquiry;
                            @XmlElement(name = "GprsLocationUpdate", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationUpdate gprsLocationUpdate;
                            @XmlElement(name = "LocationCancellation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationCancellation locationCancellation;
                            @XmlElement(name = "MsPurging", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MsPurging msPurging;
                            @XmlElement(name = "Reset", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reset reset;
                            @XmlElement(name = "NetworkUnstructuredSs", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkUnstructuredSs networkUnstructuredSs;
                            @XmlElement(name = "Reporting", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reporting reporting;
                            @XmlElement(name = "CallCompletion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.CallCompletion callCompletion;
                            @XmlElement(name = "IstAlerting", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.IstAlerting istAlerting;
                            @XmlElement(name = "ServiceTermination", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ServiceTermination serviceTermination;
                            @XmlElement(name = "LocationSvcGateway", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationSvcGateway locationSvcGateway;
                            @XmlElement(name = "MmEventReporting", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MmEventReporting mmEventReporting;
                            @XmlElement(name = "AuthenticationFailureReport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.AuthenticationFailureReport authenticationFailureReport;
                            @XmlElement(name = "ImsiRetrieval", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ImsiRetrieval imsiRetrieval;
                            @XmlElement(name = "GprsNotifyContext", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsNotifyContext gprsNotifyContext;
                            @XmlElement(name = "GprsLocationInfoRetrieval", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationInfoRetrieval gprsLocationInfoRetrieval;
                            @XmlElement(name = "FailureReport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.FailureReport failureReport;
                            @XmlElement(name = "SecureTransportHandling", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SecureTransportHandling secureTransportHandling;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkLocUp getNetworkLocUp() {
                                return networkLocUp;
                            }

                            
                            public void setNetworkLocUp(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkLocUp value) {
                                this.networkLocUp = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.RoamingNumberEnquiry getRoamingNumberEnquiry() {
                                return roamingNumberEnquiry;
                            }

                            
                            public void setRoamingNumberEnquiry(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.RoamingNumberEnquiry value) {
                                this.roamingNumberEnquiry = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.InfoRetrieval getInfoRetrieval() {
                                return infoRetrieval;
                            }

                            
                            public void setInfoRetrieval(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.InfoRetrieval value) {
                                this.infoRetrieval = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberDataMngt getSubscriberDataMngt() {
                                return subscriberDataMngt;
                            }

                            
                            public void setSubscriberDataMngt(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberDataMngt value) {
                                this.subscriberDataMngt = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkFunctionalSs getNetworkFunctionalSs() {
                                return networkFunctionalSs;
                            }

                            
                            public void setNetworkFunctionalSs(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkFunctionalSs value) {
                                this.networkFunctionalSs = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MwdMngt getMwdMngt() {
                                return mwdMngt;
                            }

                            
                            public void setMwdMngt(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MwdMngt value) {
                                this.mwdMngt = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMTRelay getShortMsgMTRelay() {
                                return shortMsgMTRelay;
                            }

                            
                            public void setShortMsgMTRelay(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMTRelay value) {
                                this.shortMsgMTRelay = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMORelay getShortMsgMORelay() {
                                return shortMsgMORelay;
                            }

                            
                            public void setShortMsgMORelay(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ShortMsgMORelay value) {
                                this.shortMsgMORelay = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SsInvocationNotification getSsInvocationNotification() {
                                return ssInvocationNotification;
                            }

                            
                            public void setSsInvocationNotification(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SsInvocationNotification value) {
                                this.ssInvocationNotification = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberInfoEnquiry getSubscriberInfoEnquiry() {
                                return subscriberInfoEnquiry;
                            }

                            
                            public void setSubscriberInfoEnquiry(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SubscriberInfoEnquiry value) {
                                this.subscriberInfoEnquiry = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationUpdate getGprsLocationUpdate() {
                                return gprsLocationUpdate;
                            }

                            
                            public void setGprsLocationUpdate(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationUpdate value) {
                                this.gprsLocationUpdate = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationCancellation getLocationCancellation() {
                                return locationCancellation;
                            }

                            
                            public void setLocationCancellation(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationCancellation value) {
                                this.locationCancellation = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MsPurging getMsPurging() {
                                return msPurging;
                            }

                            
                            public void setMsPurging(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MsPurging value) {
                                this.msPurging = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reset getReset() {
                                return reset;
                            }

                            
                            public void setReset(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reset value) {
                                this.reset = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkUnstructuredSs getNetworkUnstructuredSs() {
                                return networkUnstructuredSs;
                            }

                            
                            public void setNetworkUnstructuredSs(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.NetworkUnstructuredSs value) {
                                this.networkUnstructuredSs = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reporting getReporting() {
                                return reporting;
                            }

                            
                            public void setReporting(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.Reporting value) {
                                this.reporting = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.CallCompletion getCallCompletion() {
                                return callCompletion;
                            }

                            
                            public void setCallCompletion(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.CallCompletion value) {
                                this.callCompletion = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.IstAlerting getIstAlerting() {
                                return istAlerting;
                            }

                            
                            public void setIstAlerting(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.IstAlerting value) {
                                this.istAlerting = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ServiceTermination getServiceTermination() {
                                return serviceTermination;
                            }

                            
                            public void setServiceTermination(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ServiceTermination value) {
                                this.serviceTermination = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationSvcGateway getLocationSvcGateway() {
                                return locationSvcGateway;
                            }

                            
                            public void setLocationSvcGateway(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.LocationSvcGateway value) {
                                this.locationSvcGateway = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MmEventReporting getMmEventReporting() {
                                return mmEventReporting;
                            }

                            
                            public void setMmEventReporting(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.MmEventReporting value) {
                                this.mmEventReporting = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.AuthenticationFailureReport getAuthenticationFailureReport() {
                                return authenticationFailureReport;
                            }

                            
                            public void setAuthenticationFailureReport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.AuthenticationFailureReport value) {
                                this.authenticationFailureReport = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ImsiRetrieval getImsiRetrieval() {
                                return imsiRetrieval;
                            }

                            
                            public void setImsiRetrieval(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.ImsiRetrieval value) {
                                this.imsiRetrieval = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsNotifyContext getGprsNotifyContext() {
                                return gprsNotifyContext;
                            }

                            
                            public void setGprsNotifyContext(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsNotifyContext value) {
                                this.gprsNotifyContext = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationInfoRetrieval getGprsLocationInfoRetrieval() {
                                return gprsLocationInfoRetrieval;
                            }

                            
                            public void setGprsLocationInfoRetrieval(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.GprsLocationInfoRetrieval value) {
                                this.gprsLocationInfoRetrieval = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.FailureReport getFailureReport() {
                                return failureReport;
                            }

                            
                            public void setFailureReport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.FailureReport value) {
                                this.failureReport = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SecureTransportHandling getSecureTransportHandling() {
                                return secureTransportHandling;
                            }

                            
                            public void setSecureTransportHandling(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPGeneralInfoSection.MAPGeneralInfo.SecureTransportHandling value) {
                                this.secureTransportHandling = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class AuthenticationFailureReport implements Serializable { 

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class CallCompletion  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class FailureReport  implements Serializable {

                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class GprsLocationInfoRetrieval  implements Serializable {

                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class GprsLocationUpdate  implements Serializable {

                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class GprsNotifyContext  implements Serializable {

                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class ImsiRetrieval  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class InfoRetrieval  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class IstAlerting  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class LocationCancellation  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "outboundRoaming"
                            })
                            public static class LocationSvcGateway  implements Serializable {

                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class MmEventReporting  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class MsPurging  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class MwdMngt  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class NetworkFunctionalSs  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class NetworkLocUp  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class NetworkUnstructuredSs  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class Reporting  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class Reset  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class RoamingNumberEnquiry  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class SecureTransportHandling  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class ServiceTermination  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class ShortMsgMORelay  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class ShortMsgMTRelay  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "outboundRoaming"
                            })
                            public static class SsInvocationNotification  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class SubscriberDataMngt  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingMSCVLR",
                                "inboundRoamingSGSN",
                                "outboundRoaming"
                            })
                            public static class SubscriberInfoEnquiry  implements Serializable {

                                @XmlElement(name = "InboundRoamingMSC_VLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingMSCVLR;
                                @XmlElement(name = "InboundRoamingSGSN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSGSN;
                                @XmlElement(name = "OutboundRoaming", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoaming;

                                
                                public String getInboundRoamingMSCVLR() {
                                    return inboundRoamingMSCVLR;
                                }

                                
                                public void setInboundRoamingMSCVLR(String value) {
                                    this.inboundRoamingMSCVLR = value;
                                }

                                
                                public String getInboundRoamingSGSN() {
                                    return inboundRoamingSGSN;
                                }

                                
                                public void setInboundRoamingSGSN(String value) {
                                    this.inboundRoamingSGSN = value;
                                }

                                
                                public String getOutboundRoaming() {
                                    return outboundRoaming;
                                }

                                
                                public void setOutboundRoaming(String value) {
                                    this.outboundRoaming = value;
                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "mapInterOperatorSMSEnhancement"
                    })
                    public static class MAPInterOperatorSMSEnhancementSection  implements Serializable {

                        @XmlElement(name = "MAPInterOperatorSMSEnhancement", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement mapInterOperatorSMSEnhancement;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement getMAPInterOperatorSMSEnhancement() {
                            return mapInterOperatorSMSEnhancement;
                        }

                        
                        public void setMAPInterOperatorSMSEnhancement(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement value) {
                            this.mapInterOperatorSMSEnhancement = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "shortMsgGateway",
                            "shortMsgAlert"
                        })
                        public static class MAPInterOperatorSMSEnhancement  implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "ShortMsgGateway", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgGateway shortMsgGateway;
                            @XmlElement(name = "ShortMsgAlert", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgAlert shortMsgAlert;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgGateway getShortMsgGateway() {
                                return shortMsgGateway;
                            }

                            
                            public void setShortMsgGateway(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgGateway value) {
                                this.shortMsgGateway = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgAlert getShortMsgAlert() {
                                return shortMsgAlert;
                            }

                            
                            public void setShortMsgAlert(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPInterOperatorSMSEnhancementSection.MAPInterOperatorSMSEnhancement.ShortMsgAlert value) {
                                this.shortMsgAlert = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSMSIWMSC",
                                "outboungRoamingHLR"
                            })
                            public static class ShortMsgAlert  implements Serializable {

                                @XmlElement(name = "InboundRoamingSMS_IWMSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSMSIWMSC;
                                @XmlElement(name = "OutboungRoamingHLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboungRoamingHLR;

                                
                                public String getInboundRoamingSMSIWMSC() {
                                    return inboundRoamingSMSIWMSC;
                                }

                                
                                public void setInboundRoamingSMSIWMSC(String value) {
                                    this.inboundRoamingSMSIWMSC = value;
                                }

                                
                                public String getOutboungRoamingHLR() {
                                    return outboungRoamingHLR;
                                }

                                
                                public void setOutboungRoamingHLR(String value) {
                                    this.outboungRoamingHLR = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingSMSGMSC",
                                "outboungRoamingHLR"
                            })
                            public static class ShortMsgGateway  implements Serializable {

                                @XmlElement(name = "InboundRoamingSMS_GMSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingSMSGMSC;
                                @XmlElement(name = "OutboungRoamingHLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboungRoamingHLR;

                                
                                public String getInboundRoamingSMSGMSC() {
                                    return inboundRoamingSMSGMSC;
                                }

                                
                                public void setInboundRoamingSMSGMSC(String value) {
                                    this.inboundRoamingSMSGMSC = value;
                                }

                                
                                public String getOutboungRoamingHLR() {
                                    return outboungRoamingHLR;
                                }

                                
                                public void setOutboungRoamingHLR(String value) {
                                    this.outboungRoamingHLR = value;
                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "mapOptimalRouting"
                    })
                    public static class MAPOptimalRoutingSection  implements Serializable {

                        @XmlElement(name = "MAPOptimalRouting", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting mapOptimalRouting;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting getMAPOptimalRouting() {
                            return mapOptimalRouting;
                        }

                        
                        public void setMAPOptimalRouting(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting value) {
                            this.mapOptimalRouting = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "callControlTransfer",
                            "locationInfoRetrieval"
                        })
                        public static class MAPOptimalRouting  implements Serializable  {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "CallControlTransfer", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.CallControlTransfer callControlTransfer;
                            @XmlElement(name = "LocationInfoRetrieval", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.LocationInfoRetrieval locationInfoRetrieval;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.CallControlTransfer getCallControlTransfer() {
                                return callControlTransfer;
                            }

                            
                            public void setCallControlTransfer(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.CallControlTransfer value) {
                                this.callControlTransfer = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.LocationInfoRetrieval getLocationInfoRetrieval() {
                                return locationInfoRetrieval;
                            }

                            
                            public void setLocationInfoRetrieval(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MAPOptimalRoutingSection.MAPOptimalRouting.LocationInfoRetrieval value) {
                                this.locationInfoRetrieval = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingVMSC",
                                "inboundRoamingGMSC"
                            })
                            public static class CallControlTransfer implements Serializable {

                                @XmlElement(name = "InboundRoamingVMSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingVMSC;
                                @XmlElement(name = "InboundRoamingGMSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingGMSC;

                                
                                public String getInboundRoamingVMSC() {
                                    return inboundRoamingVMSC;
                                }

                                
                                public void setInboundRoamingVMSC(String value) {
                                    this.inboundRoamingVMSC = value;
                                }

                                
                                public String getInboundRoamingGMSC() {
                                    return inboundRoamingGMSC;
                                }

                                
                                public void setInboundRoamingGMSC(String value) {
                                    this.inboundRoamingGMSC = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "inboundRoamingGMSC",
                                "outboundRoamingHLR"
                            })
                            public static class LocationInfoRetrieval implements Serializable {

                                @XmlElement(name = "InboundRoamingGMSC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String inboundRoamingGMSC;
                                @XmlElement(name = "OutboundRoamingHLR", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String outboundRoamingHLR;

                                
                                public String getInboundRoamingGMSC() {
                                    return inboundRoamingGMSC;
                                }

                                
                                public void setInboundRoamingGMSC(String value) {
                                    this.inboundRoamingGMSC = value;
                                }

                                
                                public String getOutboundRoamingHLR() {
                                    return outboundRoamingHLR;
                                }

                                
                                public void setOutboundRoamingHLR(String value) {
                                    this.outboundRoamingHLR = value;
                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "mmsiwInfo"
                    })
                    public static class MMSIWInfoSection implements Serializable {

                        @XmlElement(name = "MMS_IW_Info", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo mmsiwInfo;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo getMMSIWInfo() {
                            return mmsiwInfo;
                        }

                        
                        public void setMMSIWInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo value) {
                            this.mmsiwInfo = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "mmseList"
                        })
                        public static class MMSIWInfo implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "MMSE_List", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList mmseList;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList getMMSEList() {
                                return mmseList;
                            }

                            
                            public void setMMSEList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList value) {
                                this.mmseList = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "mmse"
                            })
                            public static class MMSEList implements Serializable {

                                @XmlElement(name = "MMSE", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE> mmse;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE> getMMSE() {
                                    if (mmse == null) {
                                        mmse = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE>();
                                    }
                                    return this.mmse;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "mmscDomainName",
                                    "mmscipAddressRange",
                                    "maxMMSSizeAllowed",
                                    "deliveryReportAllowed",
                                    "readReportAllowed",
                                    "incomingMTAIPList",
                                    "outgoingMTAIPList"
                                })
                                public static class MMSE implements Serializable {

                                    @XmlElement(name = "MMSCDomainName", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String mmscDomainName;
                                    @XmlElement(name = "MMSC_IP_AddressRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String mmscipAddressRange;
                                    @XmlElement(name = "MaxMMSSizeAllowed", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String maxMMSSizeAllowed;
                                    @XmlElement(name = "DeliveryReportAllowed", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String deliveryReportAllowed;
                                    @XmlElement(name = "ReadReportAllowed", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String readReportAllowed;
                                    @XmlElement(name = "Incoming_MTA_IPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.IncomingMTAIPList incomingMTAIPList;
                                    @XmlElement(name = "Outgoing_MTA_IPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.OutgoingMTAIPList outgoingMTAIPList;

                                    
                                    public String getMMSCDomainName() {
                                        return mmscDomainName;
                                    }

                                    
                                    public void setMMSCDomainName(String value) {
                                        this.mmscDomainName = value;
                                    }

                                    
                                    public String getMMSCIPAddressRange() {
                                        return mmscipAddressRange;
                                    }

                                    
                                    public void setMMSCIPAddressRange(String value) {
                                        this.mmscipAddressRange = value;
                                    }

                                    
                                    public String getMaxMMSSizeAllowed() {
                                        return maxMMSSizeAllowed;
                                    }

                                    
                                    public void setMaxMMSSizeAllowed(String value) {
                                        this.maxMMSSizeAllowed = value;
                                    }

                                    
                                    public String getDeliveryReportAllowed() {
                                        return deliveryReportAllowed;
                                    }

                                    
                                    public void setDeliveryReportAllowed(String value) {
                                        this.deliveryReportAllowed = value;
                                    }

                                    
                                    public String getReadReportAllowed() {
                                        return readReportAllowed;
                                    }

                                    
                                    public void setReadReportAllowed(String value) {
                                        this.readReportAllowed = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.IncomingMTAIPList getIncomingMTAIPList() {
                                        return incomingMTAIPList;
                                    }

                                    
                                    public void setIncomingMTAIPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.IncomingMTAIPList value) {
                                        this.incomingMTAIPList = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.OutgoingMTAIPList getOutgoingMTAIPList() {
                                        return outgoingMTAIPList;
                                    }

                                    
                                    public void setOutgoingMTAIPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.MMSIWInfoSection.MMSIWInfo.MMSEList.MMSE.OutgoingMTAIPList value) {
                                        this.outgoingMTAIPList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "ipAddress"
                                    })
                                    public static class IncomingMTAIPList implements Serializable {

                                        @XmlElement(name = "IPAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String ipAddress;

                                        
                                        public String getIPAddress() {
                                            return ipAddress;
                                        }

                                        
                                        public void setIPAddress(String value) {
                                            this.ipAddress = value;
                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "ipAddress"
                                    })
                                    public static class OutgoingMTAIPList implements Serializable {

                                        @XmlElement(name = "IPAddress", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String ipAddress;

                                        
                                        public String getIPAddress() {
                                            return ipAddress;
                                        }

                                        
                                        public void setIPAddress(String value) {
                                            this.ipAddress = value;
                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "networkElementsInfo",
                        "sectionNA"
                    })
                    public static class NetworkElementsInfoSection implements Serializable {

                        @XmlElement(name = "NetworkElementsInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo networkElementsInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo getNetworkElementsInfo() {
                            return networkElementsInfo;
                        }

                        
                        public void setNetworkElementsInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo value) {
                            this.networkElementsInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "nwNodeList",
                            "changeHistory"
                        })
                        public static class NetworkElementsInfo implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "NwNodeList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList nwNodeList;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList getNwNodeList() {
                                return nwNodeList;
                            }

                            
                            public void setNwNodeList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList value) {
                                this.nwNodeList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "nwNode"
                            })
                            public static class NwNodeList implements Serializable {

                                @XmlElement(name = "NwNode", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode> nwNode;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode> getNwNode() {
                                    if (nwNode == null) {
                                        nwNode = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode>();
                                    }
                                    return this.nwNode;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "nwElementType",
                                    "gtAddressInfo",
                                    "ipAddressInfo",
                                    "vendorInfo",
                                    "swHwVersion",
                                    "dualAccess",
                                    "utcTimeOffset"
                                })
                                public static class NwNode implements Serializable {

                                    @XmlElement(name = "NwElementType", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String nwElementType;
                                    @XmlElement(name = "GTAddressInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo gtAddressInfo;
                                    @XmlElement(name = "IPAddressInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.IPAddressInfo ipAddressInfo;
                                    @XmlElement(name = "VendorInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String vendorInfo;
                                    @XmlElement(name = "SwHwVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String swHwVersion;
                                    @XmlElement(name = "DualAccess", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String dualAccess;
                                    @XmlElement(name = "UTCTimeOffset", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String utcTimeOffset;

                                    
                                    public String getNwElementType() {
                                        return nwElementType;
                                    }

                                    
                                    public void setNwElementType(String value) {
                                        this.nwElementType = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo getGTAddressInfo() {
                                        return gtAddressInfo;
                                    }

                                    
                                    public void setGTAddressInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo value) {
                                        this.gtAddressInfo = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.IPAddressInfo getIPAddressInfo() {
                                        return ipAddressInfo;
                                    }

                                    
                                    public void setIPAddressInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.IPAddressInfo value) {
                                        this.ipAddressInfo = value;
                                    }

                                    
                                    public String getVendorInfo() {
                                        return vendorInfo;
                                    }

                                    
                                    public void setVendorInfo(String value) {
                                        this.vendorInfo = value;
                                    }

                                    
                                    public String getSwHwVersion() {
                                        return swHwVersion;
                                    }

                                    
                                    public void setSwHwVersion(String value) {
                                        this.swHwVersion = value;
                                    }

                                    
                                    public String getDualAccess() {
                                        return dualAccess;
                                    }

                                    
                                    public void setDualAccess(String value) {
                                        this.dualAccess = value;
                                    }

                                    
                                    public String getUTCTimeOffset() {
                                        return utcTimeOffset;
                                    }

                                    
                                    public void setUTCTimeOffset(String value) {
                                        this.utcTimeOffset = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "cc",
                                        "ndc",
                                        "snRange"
                                    })
                                    public static class GTAddressInfo implements Serializable {

                                        @XmlElement(name = "CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String cc;
                                        @XmlElement(name = "NDC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected long ndc;
                                        @XmlElement(name = "SN_Range", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo.SNRange snRange;

                                        
                                        public String getCC() {
                                            return cc;
                                        }

                                        
                                        public void setCC(String value) {
                                            this.cc = value;
                                        }

                                        
                                        public long getNDC() {
                                            return ndc;
                                        }

                                        
                                        public void setNDC(long value) {
                                            this.ndc = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo.SNRange getSNRange() {
                                            return snRange;
                                        }

                                        
                                        public void setSNRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.NetworkElementsInfoSection.NetworkElementsInfo.NwNodeList.NwNode.GTAddressInfo.SNRange value) {
                                            this.snRange = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "snRangeStart",
                                            "snRangeStop"
                                        })
                                        public static class SNRange implements Serializable {

                                            @XmlElement(name = "SN_RangeStart", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected String snRangeStart;
                                            @XmlElement(name = "SN_RangeStop", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected short snRangeStop;

                                            
                                            public String getSNRangeStart() {
                                                return snRangeStart;
                                            }

                                            
                                            public void setSNRangeStart(String value) {
                                                this.snRangeStart = value;
                                            }

                                            
                                            public short getSNRangeStop() {
                                                return snRangeStop;
                                            }

                                            
                                            public void setSNRangeStop(short value) {
                                                this.snRangeStop = value;
                                            }

                                        }

                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "ipAddressRange"
                                    })
                                    public static class IPAddressInfo implements Serializable {

                                        @XmlElement(name = "IPAddressRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String ipAddressRange;

                                        
                                        public String getIPAddressRange() {
                                            return ipAddressRange;
                                        }

                                        
                                        public void setIPAddressRange(String value) {
                                            this.ipAddressRange = value;
                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "packetDataServiceInfo"
                    })
                    public static class PacketDataServiceInfoSection implements Serializable {

                        @XmlElement(name = "PacketDataServiceInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo packetDataServiceInfo;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo getPacketDataServiceInfo() {
                            return packetDataServiceInfo;
                        }

                        
                        public void setPacketDataServiceInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo value) {
                            this.packetDataServiceInfo = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "apnOperatorIdentifierList",
                            "testingAPNs",
                            "gtpVersionInfo",
                            "dataServicesSupportedList",
                            "multiplePDPContextSupport",
                            "iPv6ConnectivityInformation",
                            "qosProfile2G3GList",
                            "changeHistory"
                        })
                        public static class PacketDataServiceInfo implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "APNOperatorIdentifierList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList apnOperatorIdentifierList;
                            @XmlElement(name = "TestingAPNs", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs testingAPNs;
                            @XmlElement(name = "GTPVersionInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.GTPVersionInfo gtpVersionInfo;
                            @XmlElement(name = "DataServicesSupportedList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList dataServicesSupportedList;
                            @XmlElement(name = "MultiplePDPContextSupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.MultiplePDPContextSupport multiplePDPContextSupport;
                            @XmlElement(name = "IPv6ConnectivityInformation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation iPv6ConnectivityInformation;
                            @XmlElement(name = "QOSProfile2G3GList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList qosProfile2G3GList;
                            @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory changeHistory;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList getAPNOperatorIdentifierList() {
                                return apnOperatorIdentifierList;
                            }

                            
                            public void setAPNOperatorIdentifierList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList value) {
                                this.apnOperatorIdentifierList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs getTestingAPNs() {
                                return testingAPNs;
                            }

                            
                            public void setTestingAPNs(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs value) {
                                this.testingAPNs = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.GTPVersionInfo getGTPVersionInfo() {
                                return gtpVersionInfo;
                            }

                            
                            public void setGTPVersionInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.GTPVersionInfo value) {
                                this.gtpVersionInfo = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList getDataServicesSupportedList() {
                                return dataServicesSupportedList;
                            }

                            
                            public void setDataServicesSupportedList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList value) {
                                this.dataServicesSupportedList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.MultiplePDPContextSupport getMultiplePDPContextSupport() {
                                return multiplePDPContextSupport;
                            }

                            
                            public void setMultiplePDPContextSupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.MultiplePDPContextSupport value) {
                                this.multiplePDPContextSupport = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation getIPv6ConnectivityInformation() {
                                return iPv6ConnectivityInformation;
                            }

                            
                            public void setIPv6ConnectivityInformation(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation value) {
                                this.iPv6ConnectivityInformation = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList getQOSProfile2G3GList() {
                                return qosProfile2G3GList;
                            }

                            
                            public void setQOSProfile2G3GList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList value) {
                                this.qosProfile2G3GList = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory getChangeHistory() {
                                return changeHistory;
                            }

                            
                            public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory value) {
                                this.changeHistory = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "apnOperatorIdentifierItem"
                            })
                            public static class APNOperatorIdentifierList implements Serializable {

                                @XmlElement(name = "APNOperatorIdentifierItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList.APNOperatorIdentifierItem> apnOperatorIdentifierItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList.APNOperatorIdentifierItem> getAPNOperatorIdentifierItem() {
                                    if (apnOperatorIdentifierItem == null) {
                                        apnOperatorIdentifierItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.APNOperatorIdentifierList.APNOperatorIdentifierItem>();
                                    }
                                    return this.apnOperatorIdentifierItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "apnOperatorIdentifier"
                                })
                                public static class APNOperatorIdentifierItem implements Serializable {

                                    @XmlElement(name = "APNOperatorIdentifier", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String apnOperatorIdentifier;

                                    
                                    public String getAPNOperatorIdentifier() {
                                        return apnOperatorIdentifier;
                                    }

                                    
                                    public void setAPNOperatorIdentifier(String value) {
                                        this.apnOperatorIdentifier = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "changeHistoryItem"
                            })
                            public static class ChangeHistory implements Serializable {

                                @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                    if (changeHistoryItem == null) {
                                        changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.ChangeHistory.ChangeHistoryItem>();
                                    }
                                    return this.changeHistoryItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "date",
                                    "description"
                                })
                                public static class ChangeHistoryItem implements Serializable {

                                    @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar date;
                                    @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String description;

                                    
                                    public XMLGregorianCalendar getDate() {
                                        return date;
                                    }

                                    
                                    public void setDate(XMLGregorianCalendar value) {
                                        this.date = value;
                                    }

                                    
                                    public String getDescription() {
                                        return description;
                                    }

                                    
                                    public void setDescription(String value) {
                                        this.description = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "dataServicesSupportedItem"
                            })
                            public static class DataServicesSupportedList implements Serializable {

                                @XmlElement(name = "DataServicesSupportedItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList.DataServicesSupportedItem> dataServicesSupportedItem;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList.DataServicesSupportedItem> getDataServicesSupportedItem() {
                                    if (dataServicesSupportedItem == null) {
                                        dataServicesSupportedItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.DataServicesSupportedList.DataServicesSupportedItem>();
                                    }
                                    return this.dataServicesSupportedItem;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataServiceSupported"
                                })
                                public static class DataServicesSupportedItem implements Serializable {

                                    @XmlElement(name = "DataServiceSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String dataServiceSupported;

                                    
                                    public String getDataServiceSupported() {
                                        return dataServiceSupported;
                                    }

                                    
                                    public void setDataServiceSupported(String value) {
                                        this.dataServiceSupported = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "sgsngtpVersion",
                                "ggsngtpVersion"
                            })
                            public static class GTPVersionInfo implements Serializable {

                                @XmlElement(name = "SGSN_GTPVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String sgsngtpVersion;
                                @XmlElement(name = "GGSN_GTPVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String ggsngtpVersion;

                                
                                public String getSGSNGTPVersion() {
                                    return sgsngtpVersion;
                                }

                                
                                public void setSGSNGTPVersion(String value) {
                                    this.sgsngtpVersion = value;
                                }

                                
                                public String getGGSNGTPVersion() {
                                    return ggsngtpVersion;
                                }

                                
                                public void setGGSNGTPVersion(String value) {
                                    this.ggsngtpVersion = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "sgsnSupport",
                                "ggsnSupport"
                            })
                            public static class IPv6ConnectivityInformation implements Serializable {

                                @XmlElement(name = "SGSNSupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.SGSNSupport sgsnSupport;
                                @XmlElement(name = "GGSNSupport", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.GGSNSupport ggsnSupport;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.SGSNSupport getSGSNSupport() {
                                    return sgsnSupport;
                                }

                                
                                public void setSGSNSupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.SGSNSupport value) {
                                    this.sgsnSupport = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.GGSNSupport getGGSNSupport() {
                                    return ggsnSupport;
                                }

                                
                                public void setGGSNSupport(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.IPv6ConnectivityInformation.GGSNSupport value) {
                                    this.ggsnSupport = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "iPv6PDPSupported",
                                    "iPv4V6PDPSupported"
                                })
                                public static class GGSNSupport implements Serializable {

                                    @XmlElement(name = "IPv6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv6PDPSupported;
                                    @XmlElement(name = "IPv4v6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv4V6PDPSupported;

                                    
                                    public String getIPv6PDPSupported() {
                                        return iPv6PDPSupported;
                                    }

                                    
                                    public void setIPv6PDPSupported(String value) {
                                        this.iPv6PDPSupported = value;
                                    }

                                    
                                    public String getIPv4V6PDPSupported() {
                                        return iPv4V6PDPSupported;
                                    }

                                    
                                    public void setIPv4V6PDPSupported(String value) {
                                        this.iPv4V6PDPSupported = value;
                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "iPv6PDPSupported",
                                    "iPv4V6PDPSupported"
                                })
                                public static class SGSNSupport implements Serializable {

                                    @XmlElement(name = "IPv6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv6PDPSupported;
                                    @XmlElement(name = "IPv4v6PDPSupported", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String iPv4V6PDPSupported;

                                    
                                    public String getIPv6PDPSupported() {
                                        return iPv6PDPSupported;
                                    }

                                    
                                    public void setIPv6PDPSupported(String value) {
                                        this.iPv6PDPSupported = value;
                                    }

                                    
                                    public String getIPv4V6PDPSupported() {
                                        return iPv4V6PDPSupported;
                                    }

                                    
                                    public void setIPv4V6PDPSupported(String value) {
                                        this.iPv4V6PDPSupported = value;
                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "numOfPrimaryPDPContext"
                            })
                            public static class MultiplePDPContextSupport implements Serializable {

                                @XmlElement(name = "NumOfPrimaryPDPContext", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected String numOfPrimaryPDPContext;

                                
                                public String getNumOfPrimaryPDPContext() {
                                    return numOfPrimaryPDPContext;
                                }

                                
                                public void setNumOfPrimaryPDPContext(String value) {
                                    this.numOfPrimaryPDPContext = value;
                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "qosProfile2G3GItem"
                            })
                            public static class QOSProfile2G3GList implements Serializable {

                                @XmlElement(name = "QOSProfile2G3GItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem qosProfile2G3GItem;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem getQOSProfile2G3GItem() {
                                    return qosProfile2G3GItem;
                                }

                                
                                public void setQOSProfile2G3GItem(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem value) {
                                    this.qosProfile2G3GItem = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "profileName2G3G",
                                    "trafficClass",
                                    "arp2G3GList",
                                    "evolvedARP",
                                    "sduFormatInformation2G3GList"
                                })
                                public static class QOSProfile2G3GItem implements Serializable {

                                    @XmlElement(name = "ProfileName2G3G", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String profileName2G3G;
                                    @XmlElement(name = "TrafficClass", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String trafficClass;
                                    @XmlElement(name = "ARP2G3GList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem.ARP2G3GList arp2G3GList;
                                    @XmlElement(name = "EvolvedARP", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String evolvedARP;
                                    @XmlElement(name = "SDUFormatInformation2G3GList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String sduFormatInformation2G3GList;

                                    
                                    public String getProfileName2G3G() {
                                        return profileName2G3G;
                                    }

                                    
                                    public void setProfileName2G3G(String value) {
                                        this.profileName2G3G = value;
                                    }

                                    
                                    public String getTrafficClass() {
                                        return trafficClass;
                                    }

                                    
                                    public void setTrafficClass(String value) {
                                        this.trafficClass = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem.ARP2G3GList getARP2G3GList() {
                                        return arp2G3GList;
                                    }

                                    
                                    public void setARP2G3GList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.QOSProfile2G3GList.QOSProfile2G3GItem.ARP2G3GList value) {
                                        this.arp2G3GList = value;
                                    }

                                    
                                    public String getEvolvedARP() {
                                        return evolvedARP;
                                    }

                                    
                                    public void setEvolvedARP(String value) {
                                        this.evolvedARP = value;
                                    }

                                    
                                    public String getSDUFormatInformation2G3GList() {
                                        return sduFormatInformation2G3GList;
                                    }

                                    
                                    public void setSDUFormatInformation2G3GList(String value) {
                                        this.sduFormatInformation2G3GList = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "arp2G3G"
                                    })
                                    public static class ARP2G3GList implements Serializable{

                                        @XmlElement(name = "ARP2G3G", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String arp2G3G;

                                        
                                        public String getARP2G3G() {
                                            return arp2G3G;
                                        }

                                        
                                        public void setARP2G3G(String value) {
                                            this.arp2G3G = value;
                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "apnwebList",
                                "apnwapList",
                                "apnmmsList"
                            })
                            public static class TestingAPNs implements Serializable {

                                @XmlElement(name = "APN_WEBList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList apnwebList;
                                @XmlElement(name = "APN_WAPList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList apnwapList;
                                @XmlElement(name = "APN_MMSList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList apnmmsList;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList getAPNWEBList() {
                                    return apnwebList;
                                }

                                
                                public void setAPNWEBList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList value) {
                                    this.apnwebList = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList getAPNWAPList() {
                                    return apnwapList;
                                }

                                
                                public void setAPNWAPList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList value) {
                                    this.apnwapList = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList getAPNMMSList() {
                                    return apnmmsList;
                                }

                                
                                public void setAPNMMSList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList value) {
                                    this.apnmmsList = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "apnmms"
                                })
                                public static class APNMMSList implements Serializable {

                                    @XmlElement(name = "APN_MMS", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS> apnmms;

                                    
                                    public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS> getAPNMMS() {
                                        if (apnmms == null) {
                                            apnmms = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS>();
                                        }
                                        return this.apnmms;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "apnCredential",
                                        "mmsGatewayIPAddress",
                                        "messagingServerURL"
                                    })
                                    public static class APNMMS implements Serializable {

                                        @XmlElement(name = "APN_Credential", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS.APNCredential apnCredential;
                                        @XmlElement(name = "MMS_Gateway_IP_Address", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String mmsGatewayIPAddress;
                                        @XmlElement(name = "Messaging_Server_URL", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        @XmlSchemaType(name = "anyURI")
                                        protected String messagingServerURL;

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS.APNCredential getAPNCredential() {
                                            return apnCredential;
                                        }

                                        
                                        public void setAPNCredential(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNMMSList.APNMMS.APNCredential value) {
                                            this.apnCredential = value;
                                        }

                                        
                                        public String getMMSGatewayIPAddress() {
                                            return mmsGatewayIPAddress;
                                        }

                                        
                                        public void setMMSGatewayIPAddress(String value) {
                                            this.mmsGatewayIPAddress = value;
                                        }

                                        
                                        public String getMessagingServerURL() {
                                            return messagingServerURL;
                                        }

                                        
                                        public void setMessagingServerURL(String value) {
                                            this.messagingServerURL = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "apn",
                                            "username",
                                            "password"
                                        })
                                        public static class APNCredential implements Serializable {

                                            @XmlElement(name = "APN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String apn;
                                            @XmlElement(name = "Username", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String username;
                                            @XmlElement(name = "Password", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String password;

                                            
                                            public String getAPN() {
                                                return apn;
                                            }

                                            
                                            public void setAPN(String value) {
                                                this.apn = value;
                                            }

                                            
                                            public String getUsername() {
                                                return username;
                                            }

                                            
                                            public void setUsername(String value) {
                                                this.username = value;
                                            }

                                            
                                            public String getPassword() {
                                                return password;
                                            }

                                            
                                            public void setPassword(String value) {
                                                this.password = value;
                                            }

                                        }

                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "apnwap"
                                })
                                public static class APNWAPList implements Serializable {

                                    @XmlElement(name = "APN_WAP", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP> apnwap;

                                    
                                    public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP> getAPNWAP() {
                                        if (apnwap == null) {
                                            apnwap = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP>();
                                        }
                                        return this.apnwap;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "apnCredential",
                                        "wapGatewayIPAddress",
                                        "wapServerURL",
                                        "wap1PortList"
                                    })
                                    public static class APNWAP implements Serializable {

                                        @XmlElement(name = "APN_Credential", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.APNCredential apnCredential;
                                        @XmlElement(name = "WAP_Gateway_IP_Address", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String wapGatewayIPAddress;
                                        @XmlElement(name = "WAP_Server_URL", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        @XmlSchemaType(name = "anyURI")
                                        protected String wapServerURL;
                                        @XmlElement(name = "WAP1_PortList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.WAP1PortList wap1PortList;

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.APNCredential getAPNCredential() {
                                            return apnCredential;
                                        }

                                        
                                        public void setAPNCredential(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.APNCredential value) {
                                            this.apnCredential = value;
                                        }

                                        
                                        public String getWAPGatewayIPAddress() {
                                            return wapGatewayIPAddress;
                                        }

                                        
                                        public void setWAPGatewayIPAddress(String value) {
                                            this.wapGatewayIPAddress = value;
                                        }

                                        
                                        public String getWAPServerURL() {
                                            return wapServerURL;
                                        }

                                        
                                        public void setWAPServerURL(String value) {
                                            this.wapServerURL = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.WAP1PortList getWAP1PortList() {
                                            return wap1PortList;
                                        }

                                        
                                        public void setWAP1PortList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWAPList.APNWAP.WAP1PortList value) {
                                            this.wap1PortList = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "apn",
                                            "username",
                                            "password"
                                        })
                                        public static class APNCredential implements Serializable {

                                            @XmlElement(name = "APN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String apn;
                                            @XmlElement(name = "Username", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String username;
                                            @XmlElement(name = "Password", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String password;

                                            
                                            public String getAPN() {
                                                return apn;
                                            }

                                            
                                            public void setAPN(String value) {
                                                this.apn = value;
                                            }

                                            
                                            public String getUsername() {
                                                return username;
                                            }

                                            
                                            public void setUsername(String value) {
                                                this.username = value;
                                            }

                                            
                                            public String getPassword() {
                                                return password;
                                            }

                                            
                                            public void setPassword(String value) {
                                                this.password = value;
                                            }

                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "wapPort"
                                        })
                                        public static class WAP1PortList implements Serializable {

                                            @XmlElement(name = "WAP_Port", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected short wapPort;

                                            
                                            public short getWAPPort() {
                                                return wapPort;
                                            }

                                            
                                            public void setWAPPort(short value) {
                                                this.wapPort = value;
                                            }

                                        }

                                    }

                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "apnweb"
                                })
                                public static class APNWEBList implements Serializable {

                                    @XmlElement(name = "APN_WEB", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB> apnweb;

                                    
                                    public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB> getAPNWEB() {
                                        if (apnweb == null) {
                                            apnweb = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB>();
                                        }
                                        return this.apnweb;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "apnCredential",
                                        "ispdnsipAddressPrimary",
                                        "ispdnsipAddressSecondary"
                                    })
                                    public static class APNWEB implements Serializable {

                                        @XmlElement(name = "APN_Credential", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB.APNCredential apnCredential;
                                        @XmlElement(name = "ISP_DNS_IP_AddressPrimary", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String ispdnsipAddressPrimary;
                                        @XmlElement(name = "ISP_DNS_IP_AddressSecondary", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected String ispdnsipAddressSecondary;

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB.APNCredential getAPNCredential() {
                                            return apnCredential;
                                        }

                                        
                                        public void setAPNCredential(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.PacketDataServiceInfoSection.PacketDataServiceInfo.TestingAPNs.APNWEBList.APNWEB.APNCredential value) {
                                            this.apnCredential = value;
                                        }

                                        
                                        public String getISPDNSIPAddressPrimary() {
                                            return ispdnsipAddressPrimary;
                                        }

                                        
                                        public void setISPDNSIPAddressPrimary(String value) {
                                            this.ispdnsipAddressPrimary = value;
                                        }

                                        
                                        public String getISPDNSIPAddressSecondary() {
                                            return ispdnsipAddressSecondary;
                                        }

                                        
                                        public void setISPDNSIPAddressSecondary(String value) {
                                            this.ispdnsipAddressSecondary = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "apn",
                                            "username",
                                            "password"
                                        })
                                        public static class APNCredential implements Serializable {

                                            @XmlElement(name = "APN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String apn;
                                            @XmlElement(name = "Username", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String username;
                                            @XmlElement(name = "Password", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                            protected String password;

                                            
                                            public String getAPN() {
                                                return apn;
                                            }

                                            
                                            public void setAPN(String value) {
                                                this.apn = value;
                                            }

                                            
                                            public String getUsername() {
                                                return username;
                                            }

                                            
                                            public void setUsername(String value) {
                                                this.username = value;
                                            }

                                            
                                            public String getPassword() {
                                                return password;
                                            }

                                            
                                            public void setPassword(String value) {
                                                this.password = value;
                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "effectiveDateOfChange",
                        "ccitte164NumberSeries",
                        "ccitte212NumberSeries",
                        "ccitte214MGT",
                        "doesNumberPortabilityApply",
                        "npe164NumberRangesList",
                        "usimsimHeader",
                        "additionalInformation",
                        "changeHistory"
                    })
                    public static class RoutingInfoSection implements Serializable {

                        @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar effectiveDateOfChange;
                        @XmlElement(name = "CCITT_E164_NumberSeries", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries ccitte164NumberSeries;
                        @XmlElement(name = "CCITT_E212_NumberSeries", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE212NumberSeries ccitte212NumberSeries;
                        @XmlElement(name = "CCITT_E214_MGT", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE214MGT ccitte214MGT;
                        @XmlElement(name = "DoesNumberPortabilityApply", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String doesNumberPortabilityApply;
                        @XmlElement(name = "NP_E164NumberRangesList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList npe164NumberRangesList;
                        @XmlElement(name = "USIM_SIM_Header", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected String usimsimHeader;
                        @XmlElement(name = "AdditionalInformation", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.AdditionalInformation additionalInformation;
                        @XmlElement(name = "ChangeHistory", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory changeHistory;

                        
                        public XMLGregorianCalendar getEffectiveDateOfChange() {
                            return effectiveDateOfChange;
                        }

                        
                        public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                            this.effectiveDateOfChange = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries getCCITTE164NumberSeries() {
                            return ccitte164NumberSeries;
                        }

                        
                        public void setCCITTE164NumberSeries(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries value) {
                            this.ccitte164NumberSeries = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE212NumberSeries getCCITTE212NumberSeries() {
                            return ccitte212NumberSeries;
                        }

                        
                        public void setCCITTE212NumberSeries(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE212NumberSeries value) {
                            this.ccitte212NumberSeries = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE214MGT getCCITTE214MGT() {
                            return ccitte214MGT;
                        }

                        
                        public void setCCITTE214MGT(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE214MGT value) {
                            this.ccitte214MGT = value;
                        }

                        
                        public String getDoesNumberPortabilityApply() {
                            return doesNumberPortabilityApply;
                        }

                        
                        public void setDoesNumberPortabilityApply(String value) {
                            this.doesNumberPortabilityApply = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList getNPE164NumberRangesList() {
                            return npe164NumberRangesList;
                        }

                        
                        public void setNPE164NumberRangesList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList value) {
                            this.npe164NumberRangesList = value;
                        }

                        
                        public String getUSIMSIMHeader() {
                            return usimsimHeader;
                        }

                        
                        public void setUSIMSIMHeader(String value) {
                            this.usimsimHeader = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.AdditionalInformation getAdditionalInformation() {
                            return additionalInformation;
                        }

                        
                        public void setAdditionalInformation(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.AdditionalInformation value) {
                            this.additionalInformation = value;
                        }

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory getChangeHistory() {
                            return changeHistory;
                        }

                        
                        public void setChangeHistory(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory value) {
                            this.changeHistory = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "additionalInformationLine"
                        })
                        public static class AdditionalInformation implements Serializable {

                            @XmlElement(name = "AdditionalInformationLine", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected List<String> additionalInformationLine;

                            
                            public List<String> getAdditionalInformationLine() {
                                if (additionalInformationLine == null) {
                                    additionalInformationLine = new ArrayList<String>();
                                }
                                return this.additionalInformationLine;
                            }

                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "msisdnNumberRanges",
                            "gtNumberRanges",
                            "msrnNumberRanges"
                        })
                        public static class CCITTE164NumberSeries implements Serializable {

                            @XmlElement(name = "MSISDN_NumberRanges", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges msisdnNumberRanges;
                            @XmlElement(name = "GT_NumberRanges", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges gtNumberRanges;
                            @XmlElement(name = "MSRN_NumberRanges", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges msrnNumberRanges;

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges getMSISDNNumberRanges() {
                                return msisdnNumberRanges;
                            }

                            
                            public void setMSISDNNumberRanges(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges value) {
                                this.msisdnNumberRanges = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges getGTNumberRanges() {
                                return gtNumberRanges;
                            }

                            
                            public void setGTNumberRanges(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges value) {
                                this.gtNumberRanges = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges getMSRNNumberRanges() {
                                return msrnNumberRanges;
                            }

                            
                            public void setMSRNNumberRanges(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges value) {
                                this.msrnNumberRanges = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "rangeData"
                            })
                            public static class GTNumberRanges implements Serializable {

                                @XmlElement(name = "RangeData", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData> rangeData;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData> getRangeData() {
                                    if (rangeData == null) {
                                        rangeData = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData>();
                                    }
                                    return this.rangeData;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "numberRange"
                                })
                                public static class RangeData implements Serializable {

                                    @XmlElement(name = "NumberRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange numberRange;

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange getNumberRange() {
                                        return numberRange;
                                    }

                                    
                                    public void setNumberRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange value) {
                                        this.numberRange = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "cc",
                                        "ndc",
                                        "snRange"
                                    })
                                    public static class NumberRange implements Serializable {

                                        @XmlElement(name = "CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String cc;
                                        @XmlElement(name = "NDC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected short ndc;
                                        @XmlElement(name = "SN_Range", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange.SNRange snRange;

                                        
                                        public String getCC() {
                                            return cc;
                                        }

                                        
                                        public void setCC(String value) {
                                            this.cc = value;
                                        }

                                        
                                        public short getNDC() {
                                            return ndc;
                                        }

                                        
                                        public void setNDC(short value) {
                                            this.ndc = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange.SNRange getSNRange() {
                                            return snRange;
                                        }

                                        
                                        public void setSNRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.GTNumberRanges.RangeData.NumberRange.SNRange value) {
                                            this.snRange = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "snRangeStart",
                                            "snRangeStop"
                                        })
                                        public static class SNRange implements Serializable {

                                            @XmlElement(name = "SN_RangeStart", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected String snRangeStart;
                                            @XmlElement(name = "SN_RangeStop", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected long snRangeStop;

                                            
                                            public String getSNRangeStart() {
                                                return snRangeStart;
                                            }

                                            
                                            public void setSNRangeStart(String value) {
                                                this.snRangeStart = value;
                                            }

                                            
                                            public long getSNRangeStop() {
                                                return snRangeStop;
                                            }

                                            
                                            public void setSNRangeStop(long value) {
                                                this.snRangeStop = value;
                                            }

                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "rangeData"
                            })
                            public static class MSISDNNumberRanges implements Serializable {

                                @XmlElement(name = "RangeData", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData> rangeData;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData> getRangeData() {
                                    if (rangeData == null) {
                                        rangeData = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData>();
                                    }
                                    return this.rangeData;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "numberRange"
                                })
                                public static class RangeData implements Serializable {

                                    @XmlElement(name = "NumberRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange numberRange;

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange getNumberRange() {
                                        return numberRange;
                                    }

                                    
                                    public void setNumberRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange value) {
                                        this.numberRange = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "cc",
                                        "ndc",
                                        "snRange"
                                    })
                                    public static class NumberRange implements Serializable {

                                        @XmlElement(name = "CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String cc;
                                        @XmlElement(name = "NDC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected int ndc;
                                        @XmlElement(name = "SN_Range", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange.SNRange snRange;

                                        
                                        public String getCC() {
                                            return cc;
                                        }

                                        
                                        public void setCC(String value) {
                                            this.cc = value;
                                        }

                                        
                                        public int getNDC() {
                                            return ndc;
                                        }

                                        
                                        public void setNDC(int value) {
                                            this.ndc = value;
                                        }

                                        
                                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange.SNRange getSNRange() {
                                            return snRange;
                                        }

                                        
                                        public void setSNRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSISDNNumberRanges.RangeData.NumberRange.SNRange value) {
                                            this.snRange = value;
                                        }


                                        
                                        @XmlAccessorType(XmlAccessType.FIELD)
                                        @XmlType(name = "", propOrder = {
                                            "snRangeStart",
                                            "snRangeStop"
                                        })
                                        public static class SNRange implements Serializable {

                                            @XmlElement(name = "SN_RangeStart", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected String snRangeStart;
                                            @XmlElement(name = "SN_RangeStop", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                            protected int snRangeStop;

                                            
                                            public String getSNRangeStart() {
                                                return snRangeStart;
                                            }

                                            
                                            public void setSNRangeStart(String value) {
                                                this.snRangeStart = value;
                                            }

                                            
                                            public int getSNRangeStop() {
                                                return snRangeStop;
                                            }

                                            
                                            public void setSNRangeStop(int value) {
                                                this.snRangeStop = value;
                                            }

                                        }

                                    }

                                }

                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "numberRange"
                            })
                            public static class MSRNNumberRanges implements Serializable {

                                @XmlElement(name = "NumberRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange> numberRange;

                                
                                public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange> getNumberRange() {
                                    if (numberRange == null) {
                                        numberRange = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange>();
                                    }
                                    return this.numberRange;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "cc",
                                    "ndc",
                                    "snRange"
                                })
                                public static class NumberRange implements Serializable {

                                    @XmlElement(name = "CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String cc;
                                    @XmlElement(name = "NDC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected short ndc;
                                    @XmlElement(name = "SN_Range", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange.SNRange snRange;

                                    
                                    public String getCC() {
                                        return cc;
                                    }

                                    
                                    public void setCC(String value) {
                                        this.cc = value;
                                    }

                                    
                                    public short getNDC() {
                                        return ndc;
                                    }

                                    
                                    public void setNDC(short value) {
                                        this.ndc = value;
                                    }

                                    
                                    public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange.SNRange getSNRange() {
                                        return snRange;
                                    }

                                    
                                    public void setSNRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.CCITTE164NumberSeries.MSRNNumberRanges.NumberRange.SNRange value) {
                                        this.snRange = value;
                                    }


                                    
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "snRangeStart",
                                        "snRangeStop"
                                    })
                                    public static class SNRange implements Serializable {

                                        @XmlElement(name = "SN_RangeStart", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected String snRangeStart;
                                        @XmlElement(name = "SN_RangeStop", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                        protected int snRangeStop;

                                        
                                        public String getSNRangeStart() {
                                            return snRangeStart;
                                        }

                                        
                                        public void setSNRangeStart(String value) {
                                            this.snRangeStart = value;
                                        }

                                        
                                        public int getSNRangeStop() {
                                            return snRangeStop;
                                        }

                                        
                                        public void setSNRangeStop(int value) {
                                            this.snRangeStop = value;
                                        }

                                    }

                                }

                            }

                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "mcc",
                            "mnc"
                        })
                        public static class CCITTE212NumberSeries implements Serializable {

                            @XmlElement(name = "MCC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected short mcc;
                            @XmlElement(name = "MNC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected String mnc;

                            
                            public short getMCC() {
                                return mcc;
                            }

                            
                            public void setMCC(short value) {
                                this.mcc = value;
                            }

                            
                            public String getMNC() {
                                return mnc;
                            }

                            
                            public void setMNC(String value) {
                                this.mnc = value;
                            }

                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "mgtcc",
                            "mgtnc"
                        })
                        public static class CCITTE214MGT implements Serializable {

                            @XmlElement(name = "MGT_CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected String mgtcc;
                            @XmlElement(name = "MGT_NC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected short mgtnc;

                            
                            public String getMGTCC() {
                                return mgtcc;
                            }

                            
                            public void setMGTCC(String value) {
                                this.mgtcc = value;
                            }

                            
                            public short getMGTNC() {
                                return mgtnc;
                            }

                            
                            public void setMGTNC(short value) {
                                this.mgtnc = value;
                            }

                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "changeHistoryItem"
                        })
                        public static class ChangeHistory implements Serializable {

                            @XmlElement(name = "ChangeHistoryItem", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory.ChangeHistoryItem> changeHistoryItem;

                            
                            public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory.ChangeHistoryItem> getChangeHistoryItem() {
                                if (changeHistoryItem == null) {
                                    changeHistoryItem = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.ChangeHistory.ChangeHistoryItem>();
                                }
                                return this.changeHistoryItem;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "date",
                                "description"
                            })
                            public static class ChangeHistoryItem implements Serializable {

                                @XmlElement(name = "Date", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                @XmlSchemaType(name = "date")
                                protected XMLGregorianCalendar date;
                                @XmlElement(name = "Description", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected String description;

                                
                                public XMLGregorianCalendar getDate() {
                                    return date;
                                }

                                
                                public void setDate(XMLGregorianCalendar value) {
                                    this.date = value;
                                }

                                
                                public String getDescription() {
                                    return description;
                                }

                                
                                public void setDescription(String value) {
                                    this.description = value;
                                }

                            }

                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "npe164NumberRange"
                        })
                        public static class NPE164NumberRangesList implements Serializable {

                            @XmlElement(name = "NP_E164NumberRange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                            protected List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange> npe164NumberRange;

                            
                            public List<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange> getNPE164NumberRange() {
                                if (npe164NumberRange == null) {
                                    npe164NumberRange = new ArrayList<TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange>();
                                }
                                return this.npe164NumberRange;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "cc",
                                "ndc",
                                "snRange"
                            })
                            public static class NPE164NumberRange implements Serializable {

                                @XmlElement(name = "CC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected String cc;
                                @XmlElement(name = "NDC", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                protected int ndc;
                                @XmlElement(name = "SN_Range", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange.SNRange snRange;

                                
                                public String getCC() {
                                    return cc;
                                }

                                
                                public void setCC(String value) {
                                    this.cc = value;
                                }

                                
                                public int getNDC() {
                                    return ndc;
                                }

                                
                                public void setNDC(int value) {
                                    this.ndc = value;
                                }

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange.SNRange getSNRange() {
                                    return snRange;
                                }

                                
                                public void setSNRange(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.RoutingInfoSection.NPE164NumberRangesList.NPE164NumberRange.SNRange value) {
                                    this.snRange = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "snRangeStart",
                                    "snRangeStop"
                                })
                                public static class SNRange implements Serializable {

                                    @XmlElement(name = "SN_RangeStart", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String snRangeStart;
                                    @XmlElement(name = "SN_RangeStop", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String snRangeStop;

                                    
                                    public String getSNRangeStart() {
                                        return snRangeStart;
                                    }

                                    
                                    public void setSNRangeStart(String value) {
                                        this.snRangeStart = value;
                                    }

                                    
                                    public String getSNRangeStop() {
                                        return snRangeStop;
                                    }

                                    
                                    public void setSNRangeStop(String value) {
                                        this.snRangeStop = value;
                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sccpProtocolAvailableAtPMN"
                    })
                    public static class SCCPProtocolAvailableAtPMNSection implements Serializable {

                        @XmlElement(name = "SCCPProtocolAvailableAtPMN", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection.SCCPProtocolAvailableAtPMN sccpProtocolAvailableAtPMN;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection.SCCPProtocolAvailableAtPMN getSCCPProtocolAvailableAtPMN() {
                            return sccpProtocolAvailableAtPMN;
                        }

                        
                        public void setSCCPProtocolAvailableAtPMN(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.SCCPProtocolAvailableAtPMNSection.SCCPProtocolAvailableAtPMN value) {
                            this.sccpProtocolAvailableAtPMN = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "etsiitut",
                            "ansi"
                        })
                        public static class SCCPProtocolAvailableAtPMN implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "ETSI_ITU-T", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected String etsiitut;
                            @XmlElement(name = "ANSI", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected String ansi;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public String getETSIITUT() {
                                return etsiitut;
                            }

                            
                            public void setETSIITUT(String value) {
                                this.etsiitut = value;
                            }

                            
                            public String getANSI() {
                                return ansi;
                            }

                            
                            public void setANSI(String value) {
                                this.ansi = value;
                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sectionNA"
                    })
                    public static class SubscrIdentityAuthenticationSection implements Serializable {

                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected String sectionNA;

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "testNumberInfo",
                        "sectionNA"
                    })
                    public static class TestNumbersInfoSection implements Serializable {

                        @XmlElement(name = "TestNumberInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo testNumberInfo;
                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                        protected String sectionNA;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo getTestNumberInfo() {
                            return testNumberInfo;
                        }

                        
                        public void setTestNumberInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo value) {
                            this.testNumberInfo = value;
                        }

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "testNumberList"
                        })
                        public static class TestNumberInfo implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "TestNumberList", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList testNumberList;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList getTestNumberList() {
                                return testNumberList;
                            }

                            
                            public void setTestNumberList(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList value) {
                                this.testNumberList = value;
                            }


                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "testNumber"
                            })
                            public static class TestNumberList implements Serializable {

                                @XmlElement(name = "TestNumber", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList.TestNumber testNumber;

                                
                                public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList.TestNumber getTestNumber() {
                                    return testNumber;
                                }

                                
                                public void setTestNumber(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.TestNumbersInfoSection.TestNumberInfo.TestNumberList.TestNumber value) {
                                    this.testNumber = value;
                                }


                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "numberType",
                                    "number",
                                    "location",
                                    "comments"
                                })
                                public static class TestNumber implements Serializable {

                                    @XmlElement(name = "NumberType", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String numberType;
                                    @XmlElement(name = "Number", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String number;
                                    @XmlElement(name = "Location", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
                                    protected String location;
                                    @XmlElement(name = "Comments", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                                    protected String comments;

                                    
                                    public String getNumberType() {
                                        return numberType;
                                    }

                                    
                                    public void setNumberType(String value) {
                                        this.numberType = value;
                                    }

                                    
                                    public String getNumber() {
                                        return number;
                                    }

                                    
                                    public void setNumber(String value) {
                                        this.number = value;
                                    }

                                    
                                    public String getLocation() {
                                        return location;
                                    }

                                    
                                    public void setLocation(String value) {
                                        this.location = value;
                                    }

                                    
                                    public String getComments() {
                                        return comments;
                                    }

                                    
                                    public void setComments(String value) {
                                        this.comments = value;
                                    }

                                }

                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "ussdInfo"
                    })
                    public static class USSDInfoSection implements Serializable {

                        @XmlElement(name = "USSDInfo", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection.USSDInfo ussdInfo;

                        
                        public TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection.USSDInfo getUSSDInfo() {
                            return ussdInfo;
                        }

                        
                        public void setUSSDInfo(TADIGRAEXIR21 .OrganisationInfo.NetworkList.Network.NetworkData.USSDInfoSection.USSDInfo value) {
                            this.ussdInfo = value;
                        }


                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "effectiveDateOfChange",
                            "isUSSDCapabilityAvailable",
                            "supportedUSSDPhase"
                        })
                        public static class USSDInfo implements Serializable {

                            @XmlElement(name = "EffectiveDateOfChange", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            @XmlSchemaType(name = "date")
                            protected XMLGregorianCalendar effectiveDateOfChange;
                            @XmlElement(name = "IsUSSDCapabilityAvailable", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected String isUSSDCapabilityAvailable;
                            @XmlElement(name = "SupportedUSSDPhase", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                            protected String supportedUSSDPhase;

                            
                            public XMLGregorianCalendar getEffectiveDateOfChange() {
                                return effectiveDateOfChange;
                            }

                            
                            public void setEffectiveDateOfChange(XMLGregorianCalendar value) {
                                this.effectiveDateOfChange = value;
                            }

                            
                            public String getIsUSSDCapabilityAvailable() {
                                return isUSSDCapabilityAvailable;
                            }

                            
                            public void setIsUSSDCapabilityAvailable(String value) {
                                this.isUSSDCapabilityAvailable = value;
                            }

                            
                            public String getSupportedUSSDPhase() {
                                return supportedUSSDPhase;
                            }

                            
                            public void setSupportedUSSDPhase(String value) {
                                this.supportedUSSDPhase = value;
                            }

                        }

                    }


                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sectionNA"
                    })
                    public static class WLANInfoSection implements Serializable {

                        @XmlElement(name = "SectionNA", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
                        protected String sectionNA;

                        
                        public String getSectionNA() {
                            return sectionNA;
                        }

                        
                        public void setSectionNA(String value) {
                            this.sectionNA = value;
                        }

                    }

                }

            }

        }

    }


    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fileCreationTimestamp",
        "tadigGenSchemaVersion",
        "tadigraexir21SchemaVersion"
    })
    public static class RAEXIR21FileHeader implements Serializable {

        @XmlElement(name = "FileCreationTimestamp", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fileCreationTimestamp;
        @XmlElement(name = "TADIGGenSchemaVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
        protected float tadigGenSchemaVersion;
        @XmlElement(name = "TADIGRAEXIR21SchemaVersion", namespace = "https://infocentre.gsm.org/TADIG-RAEX-IR21")
        protected float tadigraexir21SchemaVersion;

        
        public XMLGregorianCalendar getFileCreationTimestamp() {
            return fileCreationTimestamp;
        }

        
        public void setFileCreationTimestamp(XMLGregorianCalendar value) {
            this.fileCreationTimestamp = value;
        }

        
        public float getTADIGGenSchemaVersion() {
            return tadigGenSchemaVersion;
        }

        
        public void setTADIGGenSchemaVersion(float value) {
            this.tadigGenSchemaVersion = value;
        }

        
        public float getTADIGRAEXIR21SchemaVersion() {
            return tadigraexir21SchemaVersion;
        }

        
        public void setTADIGRAEXIR21SchemaVersion(float value) {
            this.tadigraexir21SchemaVersion = value;
        }

    }

}
