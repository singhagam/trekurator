package com.trekurator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gateway_setting")
public class GatewaySetting
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@Column(name = "gateway_name")
	private String gatewayName;
	
	@Column(name = "transaction_url")
	private String transactionUrl;
	
	@Column(name = "merchant_code")
	private String merchantCode;
	
	@Column(name = "secret_id")
	private String secretId;
	
	@Column(name = "encryption_key")
	private String encryptionKey;
	
	@Column(name = "double_verfication_URL")
	private String doubleVerficationURL;
	
	@Column(name = "Authrisation_code")
	private String authrisationCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGatewayName() {
		return gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	public String getTransactionUrl() {
		return transactionUrl;
	}

	public void setTransactionUrl(String transactionUrl) {
		this.transactionUrl = transactionUrl;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getSecretId() {
		return secretId;
	}

	public void setSecretId(String secretId) {
		this.secretId = secretId;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getDoubleVerficationURL() {
		return doubleVerficationURL;
	}

	public void setDoubleVerficationURL(String doubleVerficationURL) {
		this.doubleVerficationURL = doubleVerficationURL;
	}

	public String getAuthrisationCode() {
		return authrisationCode;
	}

	public void setAuthrisationCode(String authrisationCode) {
		this.authrisationCode = authrisationCode;
	}
	
	
}