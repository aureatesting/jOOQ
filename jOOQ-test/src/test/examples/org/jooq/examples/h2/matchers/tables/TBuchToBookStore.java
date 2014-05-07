/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBuchToBookStore extends org.jooq.impl.TableImpl<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1367651853;

	/**
	 * The singleton instance of <code>PUBLIC.T_BOOK_TO_BOOK_STORE</code>
	 */
	public static final org.jooq.examples.h2.matchers.tables.TBuchToBookStore T_BUCH_TO_BOOK_STORE = new org.jooq.examples.h2.matchers.tables.TBuchToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord> getRecordType() {
		return org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	public static final org.jooq.TableField<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), T_BUCH_TO_BOOK_STORE);

	/**
	 * The column <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	public static final org.jooq.TableField<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_BUCH_TO_BOOK_STORE);

	/**
	 * The column <code>PUBLIC.T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	public static final org.jooq.TableField<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, T_BUCH_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBuchToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.examples.h2.matchers.NonPublic.NON_PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord> getPrimaryKey() {
		return org.jooq.examples.h2.matchers.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord>>asList(org.jooq.examples.h2.matchers.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.h2.matchers.tables.records.TBuchToBookStoreRecord, ?>>asList(org.jooq.examples.h2.matchers.Keys.FK_B2BS_BS_NAME, org.jooq.examples.h2.matchers.Keys.FK_B2BS_B_ID);
	}
}