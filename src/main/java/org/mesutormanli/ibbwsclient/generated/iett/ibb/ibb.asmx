<wsdl:definitions targetNamespace="http://tempuri.org/" xmlns="" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
    <wsdl:types>
        <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema">
            <s:element name="DurakDetay_GYY">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="hat_kodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="DurakDetay_GYYResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="DurakDetay_GYYResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="HatServisi_GYY">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="hat_kodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="HatServisi_GYYResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="HatServisi_GYYResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="IETTPlakaServisi">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="KapiNo" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="IETTPlakaServisiResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="IETTPlakaServisiResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="OHOPlakaServisi_OTS">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="kapi_no" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="OHOPlakaServisi_OTSResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="OHOPlakaServisi_OTSResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
        </s:schema>
    </wsdl:types>
    <wsdl:message name="HatServisi_GYYSoapOut">
        <wsdl:part element="tns:HatServisi_GYYResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="HatServisi_GYYSoapIn">
        <wsdl:part element="tns:HatServisi_GYY" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="DurakDetay_GYYSoapIn">
        <wsdl:part element="tns:DurakDetay_GYY" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="DurakDetay_GYYSoapOut">
        <wsdl:part element="tns:DurakDetay_GYYResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:portType name="ibbSoap">
        <wsdl:operation name="DurakDetay_GYY">
            <wsdl:input message="tns:DurakDetay_GYYSoapIn"/>
            <wsdl:output message="tns:DurakDetay_GYYSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="HatServisi_GYY">
            <wsdl:input message="tns:HatServisi_GYYSoapIn"/>
            <wsdl:output message="tns:HatServisi_GYYSoapOut"/>
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="ibbSoap" type="tns:ibbSoap">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <wsdl:operation name="DurakDetay_GYY">
            <soap:operation soapAction="http://tempuri.org/DurakDetay_GYY" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="HatServisi_GYY">
            <soap:operation soapAction="http://tempuri.org/HatServisi_GYY" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:service name="ibb">
        <wsdl:port binding="tns:ibbSoap" name="ibbSoap">
            <soap:address location="https://api.ibb.gov.tr/iett/ibb/ibb.asmx"/>
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>