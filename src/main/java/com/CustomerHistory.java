package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerHistory implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "customerAttribute")
	private java.lang.Boolean customerAttribute;

	@org.kie.api.definition.type.Label(value = "value")
	private java.lang.Boolean value;

	public CustomerHistory() {
	}

	public java.lang.Boolean getCustomerAttribute() {
		return this.customerAttribute;
	}

	public void setCustomerAttribute(java.lang.Boolean customerAttribute) {
		this.customerAttribute = customerAttribute;
	}

	public java.lang.Boolean getValue() {
		return this.value;
	}

	public void setValue(java.lang.Boolean value) {
		this.value = value;
	}

	public CustomerHistory(java.lang.Boolean customerAttribute,
			java.lang.Boolean value) {
		this.customerAttribute = customerAttribute;
		this.value = value;
	}

}