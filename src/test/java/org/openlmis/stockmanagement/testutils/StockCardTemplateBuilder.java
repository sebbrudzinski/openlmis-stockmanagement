package org.openlmis.stockmanagement.testutils;

import org.openlmis.stockmanagement.domain.template.AvailableStockCardFields;
import org.openlmis.stockmanagement.domain.template.AvailableStockCardLineItemFields;
import org.openlmis.stockmanagement.domain.template.StockCardFields;
import org.openlmis.stockmanagement.domain.template.StockCardLineItemFields;
import org.openlmis.stockmanagement.domain.template.StockCardTemplate;
import org.openlmis.stockmanagement.dto.StockCardFieldDto;
import org.openlmis.stockmanagement.dto.StockCardLineItemFieldDto;
import org.openlmis.stockmanagement.dto.StockCardTemplateDto;

import java.util.UUID;

public class StockCardTemplateBuilder {

  /**
   * Create test object for stock card template.
   *
   * @return created object.
   */
  public static StockCardTemplate createTemplate() {
    StockCardTemplate template = new StockCardTemplate();
    template.setFacilityTypeId(UUID.randomUUID());
    template.setProgramId(UUID.randomUUID());

    AvailableStockCardFields packSize = new AvailableStockCardFields();
    packSize.setId(UUID.fromString("7663b4d2-d6da-11e6-bf26-cec0c932ce01"));

    AvailableStockCardLineItemFields docNumber = new AvailableStockCardLineItemFields();
    docNumber.setId(UUID.fromString("b15ad020-d6da-11e6-bf26-cec0c932ce01"));

    template.getStockCardFields()
            .add(new StockCardFields(template, packSize, true, 123));

    template.getStockCardLineItemFields()
            .add(new StockCardLineItemFields(template, docNumber, true, 456));

    return template;
  }

  /**
   * Create template dto.
   *
   * @return dto.
   */
  public static StockCardTemplateDto createTemplateDto() {
    StockCardTemplateDto dto = new StockCardTemplateDto();
    dto.setFacilityTypeId(UUID.randomUUID());
    dto.setProgramId(UUID.randomUUID());
    dto.getStockCardFields().add(new StockCardFieldDto("packSize", true, 123));
    dto.getStockCardLineItemFields().add(
            new StockCardLineItemFieldDto("documentNumber", true, 456));
    return dto;
  }
}
