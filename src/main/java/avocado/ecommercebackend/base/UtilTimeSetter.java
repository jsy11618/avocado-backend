package avocado.ecommercebackend.base;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@MappedSuperclass //어디에서든 호출하기 편하게 정의해준것
@EntityListeners(AuditingEntityListener.class) //
@Getter
public abstract class UtilTimeSetter {

    @CreatedDate
    private LocalDateTime createDate;

    private LocalDateTime modifiedData;


}
