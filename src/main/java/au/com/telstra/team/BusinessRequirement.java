package au.com.telstra.team;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class BusinessRequirement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "BUSINESSJUSTIFICATION_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "BUSINESSJUSTIFICATION_ID_GENERATOR", sequenceName = "BUSINESSJUSTIFICATION_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("BusinessJustification")
	private java.lang.String businessJustification;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("DocumentList")
	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.PERSIST}, mappedBy = "documentList", fetch = javax.persistence.FetchType.EAGER, orphanRemoval = false)
	private java.util.List<java.lang.String> documentList;

	public BusinessRequirement() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getBusinessJustification() {
		return this.businessJustification;
	}

	public void setBusinessJustification(java.lang.String businessJustification) {
		this.businessJustification = businessJustification;
	}

	public java.util.List<java.lang.String> getDocumentList() {
		return this.documentList;
	}

	public void setDocumentList(java.util.List<java.lang.String> documentList) {
		this.documentList = documentList;
	}

	public BusinessRequirement(java.lang.Long id,
			java.lang.String businessJustification,
			java.util.List<java.lang.String> documentList) {
		this.id = id;
		this.businessJustification = businessJustification;
		this.documentList = documentList;
	}

}