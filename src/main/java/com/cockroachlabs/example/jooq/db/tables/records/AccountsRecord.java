/*
 * This file is generated by jOOQ.
 */
package com.cockroachlabs.example.jooq.db.tables.records;


import com.cockroachlabs.example.jooq.db.tables.Accounts;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record2<UUID, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.accounts.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.accounts.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.accounts.balance</code>.
     */
    public void setBalance(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.accounts.balance</code>.
     */
    public Long getBalance() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Accounts.ACCOUNTS.ID;
    }

    @Override
    public Field<Long> field2() {
        return Accounts.ACCOUNTS.BALANCE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getBalance();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getBalance();
    }

    @Override
    public AccountsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsRecord value2(Long value) {
        setBalance(value);
        return this;
    }

    @Override
    public AccountsRecord values(UUID value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(UUID id, Long balance) {
        super(Accounts.ACCOUNTS);

        setId(id);
        setBalance(balance);
    }
}
