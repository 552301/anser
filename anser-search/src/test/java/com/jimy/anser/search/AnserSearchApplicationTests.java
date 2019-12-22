package com.jimy.anser.search;

import com.jimy.anser.search.dao.EsProductDao;
import com.jimy.anser.search.domain.EsProduct;
import com.jimy.anser.search.repository.EsProductRepository;
import org.elasticsearch.action.search.SearchResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ResultsExtractor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnserSearchApplicationTests {
    @Autowired
    private EsProductDao productDao;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Test
    public void contextLoads() {
    }
    @Test
    public void testGetAllEsProductList(){
        List<EsProduct> esProductList = productDao.getAllEsProductList(null);
        System.out.print(esProductList);
    }
    @Test
    public void testEsProductMapping(){
        elasticsearchTemplate.putMapping(EsProduct.class);
        Map mapping = elasticsearchTemplate.getMapping(EsProduct.class);
        System.out.println(mapping);
    }

}
