package com.elegro.masterfinan.infraestructura.entity.cruds;

import com.elegro.masterfinan.infraestructura.dao.DaoRecord;
import com.elegro.masterfinan.infraestructura.dao.DaoRecordInteger;
import com.elegro.masterfinan.infraestructura.entity.Transaccion;

public interface TransaccionDaoRepository extends DaoRecord<Transaccion>, DaoRecordInteger<Transaccion, Long> {
}
