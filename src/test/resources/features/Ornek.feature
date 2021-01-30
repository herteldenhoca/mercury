Feature:US001  Hr mercury sayfasina login
  @wip
  Scenario: Valid cridentiallarla access saglanmali
    Given Kullanici hr mercury ana sayfasina gider
    And Kullanci username textbox a valid bir username girer
    And Kullanici password textbox a valid bir username girer
    And Kullanici login butonuna basar
    Then Kullanici giris yaptigini dogrular
