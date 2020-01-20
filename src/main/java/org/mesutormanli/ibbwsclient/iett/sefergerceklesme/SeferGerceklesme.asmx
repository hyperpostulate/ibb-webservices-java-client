<wsdl:definitions targetNamespace="http://tempuri.org/" xmlns="" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:tns="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
    <wsdl:types>
        <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema">
            <s:element name="GetFiloDurum_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetFiloDurum_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetFiloDurum_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetFiloDurum_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetFiloDurum_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetFiloDurum_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetPlanaUyum_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetPlanaUyum_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetPlanaUyum_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetPlanaUyum_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetPlanaUyum_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetPlanaUyum_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaza_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaza_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaza_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaza_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaza_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaza_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetSeferZayi_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetSeferZayi_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetSeferZayi_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetSeferZayi_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetSeferZayi_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetSeferZayi_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuBilgilendirme_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetYolcuBilgilendirme_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetYolcuBilgilendirme_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuBilgilendirme_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetYolcuBilgilendirme_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetYolcuBilgilendirme_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasKazaBilgisi_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasKazaBilgisi_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasKazaBilgisi_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasKazaBilgisi_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasKazaBilgisi_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasKazaBilgisi_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasIYSRapor_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasIYSRapor_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasIYSRapor_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasIYSRapor_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasIYSRapor_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasIYSRapor_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasEksiklikBildirimi_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasEksiklikBildirimi_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasEksiklikBildirimi_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasEksiklikBildirimi_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Yil" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Ay" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="Gun" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOasEksiklikBildirimi_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOasEksiklikBildirimi_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOtsPlanlananKm_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="tarih" type="s:dateTime"/>
                        <s:element maxOccurs="1" minOccurs="0" name="KapiNo" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOtsPlanlananKm_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOtsPlanlananKm_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOtsPlanlananKm_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="tarih" type="s:dateTime"/>
                        <s:element maxOccurs="1" minOccurs="0" name="KapiNo" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetOtsPlanlananKm_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetOtsPlanlananKm_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="tarih" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="KapiNo" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutu_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="tarih" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="KapiNo" type="s:string"/>
                        <s:element maxOccurs="1" minOccurs="0" name="HatKodu" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutu_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutuSeferBilgileri_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutuSeferBilgileri_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutuSeferBilgileri_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutuSeferBilgileri_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutuSeferBilgileri_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutuSeferBilgileri_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKazaLokasyon_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKazaLokasyon_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKazaLokasyon_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKazaLokasyon_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="Tarih" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKazaLokasyon_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKazaLokasyon_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_ServiseHazirAracMetrobus_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetKaraKutu_ServiseHazirAracMetrobus_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutu_ServiseHazirAracMetrobus_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetKaraKutu_ServiseHazirAracMetrobus_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetKaraKutu_ServiseHazirAracMetrobus_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetKaraKutu_ServiseHazirAracMetrobus_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetFiloAracKonum_json">
                <s:complexType/>
            </s:element>
            <s:element name="GetFiloAracKonum_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetFiloAracKonum_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuTalep_XML">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="saat" type="s:int"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuTalep_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetYolcuTalep_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuTalep_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="saat" type="s:int"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetYolcuTalep_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetYolcuTalep_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetBozukSatih_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetBozukSatih_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetBozukSatih_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetBozukSatih_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="saat" type="s:int"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetBozukSatih_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetBozukSatih_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetUzulsuzKartKullanim_XML">
                <s:complexType/>
            </s:element>
            <s:element name="GetUzulsuzKartKullanim_XMLResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetUzulsuzKartKullanim_XMLResult">
                            <s:complexType>
                                <s:sequence>
                                    <s:any/>
                                </s:sequence>
                            </s:complexType>
                        </s:element>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetUzulsuzKartKullanim_json">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="1" name="saat" type="s:int"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
            <s:element name="GetUzulsuzKartKullanim_jsonResponse">
                <s:complexType>
                    <s:sequence>
                        <s:element maxOccurs="1" minOccurs="0" name="GetUzulsuzKartKullanim_jsonResult" type="s:string"/>
                    </s:sequence>
                </s:complexType>
            </s:element>
        </s:schema>
    </wsdl:types>
    <wsdl:message name="GetBozukSatih_jsonSoapOut">
        <wsdl:part element="tns:GetBozukSatih_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetBozukSatih_XMLSoapOut">
        <wsdl:part element="tns:GetBozukSatih_XMLResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetFiloAracKonum_jsonSoapOut">
        <wsdl:part element="tns:GetFiloAracKonum_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetFiloAracKonum_jsonSoapIn">
        <wsdl:part element="tns:GetFiloAracKonum_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetBozukSatih_jsonSoapIn">
        <wsdl:part element="tns:GetBozukSatih_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetKazaLokasyon_jsonSoapIn">
        <wsdl:part element="tns:GetKazaLokasyon_json" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetBozukSatih_XMLSoapIn">
        <wsdl:part element="tns:GetBozukSatih_XML" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetKazaLokasyon_XMLSoapOut">
        <wsdl:part element="tns:GetKazaLokasyon_XMLResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetKazaLokasyon_XMLSoapIn">
        <wsdl:part element="tns:GetKazaLokasyon_XML" name="parameters"/>
    </wsdl:message>
    <wsdl:message name="GetKazaLokasyon_jsonSoapOut">
        <wsdl:part element="tns:GetKazaLokasyon_jsonResponse" name="parameters"/>
    </wsdl:message>
    <wsdl:portType name="SeferGerceklesmeSoap">
        <wsdl:operation name="GetBozukSatih_XML">
            <wsdl:input message="tns:GetBozukSatih_XMLSoapIn"/>
            <wsdl:output message="tns:GetBozukSatih_XMLSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetBozukSatih_json">
            <wsdl:input message="tns:GetBozukSatih_jsonSoapIn"/>
            <wsdl:output message="tns:GetBozukSatih_jsonSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetFiloAracKonum_json">
            <wsdl:input message="tns:GetFiloAracKonum_jsonSoapIn"/>
            <wsdl:output message="tns:GetFiloAracKonum_jsonSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetKazaLokasyon_XML">
            <wsdl:input message="tns:GetKazaLokasyon_XMLSoapIn"/>
            <wsdl:output message="tns:GetKazaLokasyon_XMLSoapOut"/>
        </wsdl:operation>
        <wsdl:operation name="GetKazaLokasyon_json">
            <wsdl:input message="tns:GetKazaLokasyon_jsonSoapIn"/>
            <wsdl:output message="tns:GetKazaLokasyon_jsonSoapOut"/>
        </wsdl:operation>
    </wsdl:portType>
    <wsdl:binding name="SeferGerceklesmeSoap" type="tns:SeferGerceklesmeSoap">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
        <wsdl:operation name="GetBozukSatih_XML">
            <soap:operation soapAction="http://tempuri.org/GetBozukSatih_XML" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetBozukSatih_json">
            <soap:operation soapAction="http://tempuri.org/GetBozukSatih_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetFiloAracKonum_json">
            <soap:operation soapAction="http://tempuri.org/GetFiloAracKonum_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetKazaLokasyon_XML">
            <soap:operation soapAction="http://tempuri.org/GetKazaLokasyon_XML" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
        <wsdl:operation name="GetKazaLokasyon_json">
            <soap:operation soapAction="http://tempuri.org/GetKazaLokasyon_json" style="document"/>
            <wsdl:input>
                <soap:body use="literal"/>
            </wsdl:input>
            <wsdl:output>
                <soap:body use="literal"/>
            </wsdl:output>
        </wsdl:operation>
    </wsdl:binding>
    <wsdl:service name="SeferGerceklesme">
        <wsdl:port binding="tns:SeferGerceklesmeSoap" name="SeferGerceklesmeSoap">
            <soap:address location="https://api.ibb.gov.tr/iett/FiloDurum/SeferGerceklesme.asmx"/>
        </wsdl:port>
    </wsdl:service>
</wsdl:definitions>