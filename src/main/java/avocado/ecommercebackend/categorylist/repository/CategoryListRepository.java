package avocado.ecommercebackend.categorylist.repository;

import avocado.ecommercebackend.categorylist.model.CategoryList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryListRepository extends JpaRepository<CategoryList, Long> {

}
