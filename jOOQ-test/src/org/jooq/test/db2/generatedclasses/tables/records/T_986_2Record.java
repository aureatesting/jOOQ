/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_2Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> implements org.jooq.Record1<java.lang.Integer> {

	private static final long serialVersionUID = 1609953140;

	/**
	 * Setter for <code>TEST.T_986_2.REF</code>. 
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord}
	 */
	public void setRef(org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, null);
		}
		else {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, value.getValue(org.jooq.test.db2.generatedclasses.tables.XUnused.ID));
		}
	}

	/**
	 * Getter for <code>TEST.T_986_2.REF</code>. 
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>TEST.X_UNUSED</code> referenced by this <code>TEST.T_986_2</code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.db2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.db2.generatedclasses.tables.T_986_2.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRef();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.db2.generatedclasses.tables.T_986_2.T_986_2);
	}
}
