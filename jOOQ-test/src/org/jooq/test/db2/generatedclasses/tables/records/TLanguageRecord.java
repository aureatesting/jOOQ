/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.TLanguageRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 623933860;

	/**
	 * Setter for <code>TEST.T_LANGUAGE.CD</code>. 
	 */
	public void setCd(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.CD, value);
	}

	/**
	 * Getter for <code>TEST.T_LANGUAGE.CD</code>. 
	 */
	public java.lang.String getCd() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.CD);
	}

	/**
	 * Setter for <code>TEST.T_LANGUAGE.DESCRIPTION</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION, value);
	}

	/**
	 * Getter for <code>TEST.T_LANGUAGE.DESCRIPTION</code>. 
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION);
	}

	/**
	 * Setter for <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * Getter for <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH);
	}

	/**
	 * Setter for <code>TEST.T_LANGUAGE.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.ID, value);
	}

	/**
	 * Getter for <code>TEST.T_LANGUAGE.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>TEST.T_BOOK</code> referencing this <code>TEST.T_LANGUAGE</code>
	 */
	public org.jooq.Result<org.jooq.test.db2.generatedclasses.tables.records.TBookRecord> fetchTBookList() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.db2.generatedclasses.tables.TBook.LANGUAGE_ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.TLanguage.ID)))
			.fetch();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.db2.generatedclasses.tables.TLanguage.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.db2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.db2.generatedclasses.tables.TLanguage.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.db2.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}
}
