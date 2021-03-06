package com.alipay.hulu.shared.io.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.alipay.hulu.shared.io.bean.RecordCaseInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECORD_CASE_INFO".
*/
public class RecordCaseInfoDao extends AbstractDao<RecordCaseInfo, Long> {

    public static final String TABLENAME = "RECORD_CASE_INFO";

    /**
     * Properties of entity RecordCaseInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CaseName = new Property(1, String.class, "caseName", false, "CASE_NAME");
        public final static Property CaseDesc = new Property(2, String.class, "caseDesc", false, "CASE_DESC");
        public final static Property TargetAppPackage = new Property(3, String.class, "targetAppPackage", false, "TARGET_APP_PACKAGE");
        public final static Property TargetAppLabel = new Property(4, String.class, "targetAppLabel", false, "TARGET_APP_LABEL");
        public final static Property RecordMode = new Property(5, String.class, "recordMode", false, "RECORD_MODE");
        public final static Property AdvanceSettings = new Property(6, String.class, "advanceSettings", false, "ADVANCE_SETTINGS");
        public final static Property OperationLog = new Property(7, String.class, "operationLog", false, "OPERATION_LOG");
        public final static Property Priority = new Property(8, int.class, "priority", false, "PRIORITY");
        public final static Property GmtCreate = new Property(9, long.class, "gmtCreate", false, "GMT_CREATE");
        public final static Property GmtModify = new Property(10, long.class, "gmtModify", false, "GMT_MODIFY");
    }


    public RecordCaseInfoDao(DaoConfig config) {
        super(config);
    }
    
    public RecordCaseInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECORD_CASE_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CASE_NAME\" TEXT," + // 1: caseName
                "\"CASE_DESC\" TEXT," + // 2: caseDesc
                "\"TARGET_APP_PACKAGE\" TEXT," + // 3: targetAppPackage
                "\"TARGET_APP_LABEL\" TEXT," + // 4: targetAppLabel
                "\"RECORD_MODE\" TEXT," + // 5: recordMode
                "\"ADVANCE_SETTINGS\" TEXT," + // 6: advanceSettings
                "\"OPERATION_LOG\" TEXT," + // 7: operationLog
                "\"PRIORITY\" INTEGER NOT NULL ," + // 8: priority
                "\"GMT_CREATE\" INTEGER NOT NULL ," + // 9: gmtCreate
                "\"GMT_MODIFY\" INTEGER NOT NULL );"); // 10: gmtModify
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECORD_CASE_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RecordCaseInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String caseName = entity.getCaseName();
        if (caseName != null) {
            stmt.bindString(2, caseName);
        }
 
        String caseDesc = entity.getCaseDesc();
        if (caseDesc != null) {
            stmt.bindString(3, caseDesc);
        }
 
        String targetAppPackage = entity.getTargetAppPackage();
        if (targetAppPackage != null) {
            stmt.bindString(4, targetAppPackage);
        }
 
        String targetAppLabel = entity.getTargetAppLabel();
        if (targetAppLabel != null) {
            stmt.bindString(5, targetAppLabel);
        }
 
        String recordMode = entity.getRecordMode();
        if (recordMode != null) {
            stmt.bindString(6, recordMode);
        }
 
        String advanceSettings = entity.getAdvanceSettings();
        if (advanceSettings != null) {
            stmt.bindString(7, advanceSettings);
        }
 
        String operationLog = entity.getOperationLog();
        if (operationLog != null) {
            stmt.bindString(8, operationLog);
        }
        stmt.bindLong(9, entity.getPriority());
        stmt.bindLong(10, entity.getGmtCreate());
        stmt.bindLong(11, entity.getGmtModify());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RecordCaseInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String caseName = entity.getCaseName();
        if (caseName != null) {
            stmt.bindString(2, caseName);
        }
 
        String caseDesc = entity.getCaseDesc();
        if (caseDesc != null) {
            stmt.bindString(3, caseDesc);
        }
 
        String targetAppPackage = entity.getTargetAppPackage();
        if (targetAppPackage != null) {
            stmt.bindString(4, targetAppPackage);
        }
 
        String targetAppLabel = entity.getTargetAppLabel();
        if (targetAppLabel != null) {
            stmt.bindString(5, targetAppLabel);
        }
 
        String recordMode = entity.getRecordMode();
        if (recordMode != null) {
            stmt.bindString(6, recordMode);
        }
 
        String advanceSettings = entity.getAdvanceSettings();
        if (advanceSettings != null) {
            stmt.bindString(7, advanceSettings);
        }
 
        String operationLog = entity.getOperationLog();
        if (operationLog != null) {
            stmt.bindString(8, operationLog);
        }
        stmt.bindLong(9, entity.getPriority());
        stmt.bindLong(10, entity.getGmtCreate());
        stmt.bindLong(11, entity.getGmtModify());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public RecordCaseInfo readEntity(Cursor cursor, int offset) {
        RecordCaseInfo entity = new RecordCaseInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // caseName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // caseDesc
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // targetAppPackage
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // targetAppLabel
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // recordMode
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // advanceSettings
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // operationLog
            cursor.getInt(offset + 8), // priority
            cursor.getLong(offset + 9), // gmtCreate
            cursor.getLong(offset + 10) // gmtModify
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RecordCaseInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCaseName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCaseDesc(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTargetAppPackage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTargetAppLabel(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRecordMode(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAdvanceSettings(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setOperationLog(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPriority(cursor.getInt(offset + 8));
        entity.setGmtCreate(cursor.getLong(offset + 9));
        entity.setGmtModify(cursor.getLong(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RecordCaseInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RecordCaseInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RecordCaseInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
