<wsdl:definitions targetNamespace="http://tempuri.org/" xmlns="" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
    <wsdl:types>
        <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema">
            <s:element name="GetHatCekmekoy_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatCekmekoy_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatCekmekoy_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatCekmekoy_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatCekmekoy_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatCekmekoy_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakCekmekoy_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakCekmekoy_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurakCekmekoy_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakCekmekoy_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakCekmekoy_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurakCekmekoy_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLineCekmekoy_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetGuzergahLineCekmekoy_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahLineCekmekoy_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLineCekmekoy_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetGuzergahLineCekmekoy_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahLineCekmekoy_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatBeyoglu_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatBeyoglu_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatBeyoglu_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatBeyoglu_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatBeyoglu_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatBeyoglu_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakBeyoglu_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakBeyoglu_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurakBeyoglu_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakBeyoglu_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurakBeyoglu_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurakBeyoglu_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurakBeyoglu_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurakBeyoglu_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatDurakBeyoglu_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurakBeyoglu_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurakBeyoglu_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatDurakBeyoglu_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHat_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHat_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHat_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHat_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHat_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHat_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurak_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurak_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurak_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurak_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetDurak_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetDurak_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurak_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurak_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatDurak_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurak_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatDurak_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatDurak_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLine_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLine_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahLine_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLine_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahLine_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahLine_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahAciklama_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahAciklama_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahAciklama_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahAciklama_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahAciklama_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahAciklama_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatGuzergah_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatGuzergah_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatGuzergah_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatGuzergah_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatGuzergah_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatGuzergah_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahDurak_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahDurak_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahDurak_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahDurak_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGuzergahDurak_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGuzergahDurak_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatKurumsal_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatKurumsal_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatKurumsal_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatKurumsal_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatKurumsal_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatKurumsal_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetAkilliDurak_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetAkilliDurak_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetAkilliDurak_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetAkilliDurak_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetAkilliDurak_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetAkilliDurak_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGaraj_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetGaraj_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGaraj_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetGaraj_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetGaraj_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetGaraj_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatTest_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatTest_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatTest_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatTest_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetHatTest_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetHatTest_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
        </s:schema>
    </wsdl:types>
    <wsdl:message name="GetGaraj_XMLSoapOut">
        <wsdl:part element="tns:GetGaraj_XMLResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDurak_XMLSoapIn">
        <wsdl:part element="tns:GetDurak_XML" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDurak_XMLSoapOut">
        <wsdl:part element="tns:GetDurak_XMLResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetGaraj_XMLSoapIn">
        <wsdl:part element="tns:GetGaraj_XML" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetGaraj_jsonSoapIn">
        <wsdl:part element="tns:GetGaraj_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDurak_jsonSoapIn">
        <wsdl:part element="tns:GetDurak_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetGaraj_jsonSoapOut">
        <wsdl:part element="tns:GetGaraj_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetDurak_jsonSoapOut">
        <wsdl:part element="tns:GetDurak_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:portType name="WebService1Soap">
        <wsdl:operation name="GetDurak_XML">
            <wsdl:input message="tns:GetDurak_XMLSoapIn"/>
            <wsdl:output message="tns:GetDurak_XMLSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetDurak_json">
            <wsdl:input message="tns:GetDurak_jsonSoapIn"/>
            <wsdl:output message="tns:GetDurak_jsonSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetGaraj_XML">
            <wsdl:input message="tns:GetGaraj_XMLSoapIn"/>
            <wsdl:output message="tns:GetGaraj_XMLSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetGaraj_json">
            <wsdl:input message="tns:GetGaraj_jsonSoapIn"/>
            <wsdl:output message="tns:GetGaraj_jsonSoapOut"/>
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="WebService1Soap" type="tns:WebService1Soap">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <wsdl:operation name="GetDurak_XML">
            <soap:operation soapAction="http://tempuri.org/GetDurak_XML" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetDurak_json">
            <soap:operation soapAction="http://tempuri.org/GetDurak_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetGaraj_XML">
            <soap:operation soapAction="http://tempuri.org/GetGaraj_XML" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetGaraj_json">
            <soap:operation soapAction="http://tempuri.org/GetGaraj_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:service name="WebService1">
        <wsdl:port binding="tns:WebService1Soap" name="WebService1Soap">
            <soap:address location="https://api.ibb.gov.tr/iett/UlasimAnaVeri/HatDurakGuzergah.asmx"/>
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>