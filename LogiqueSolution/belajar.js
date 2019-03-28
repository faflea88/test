describe('Logique', function() {
  
  it('https://qa-engineer.logique.co.id', function() 
    {
    cy.visit("https://qa-engineer.logique.co.id");
   
    cy.get('#customer_email')
      .type('fake@email.com').should('have.value', 'fake@email.com')
    cy.get('#customer_firstname')
       .type('winda').should('have.value', 'winda')
     cy.get('#customer_lastname')
         .type('k').should('have.value', 'k')
     cy.get('#customer_address')
         .type('yogya').should('have.value', 'yogya')
     cy.get('#customer_city')
         .type('yogya').should('have.value', 'yogya')
     cy.get('#customer_phone')
      .type('12').should('have.value', '12')
     cy.get('#customer_mobile')
      .type('12').should('have.value', '12')
     cy.get('#customer_ktp')
      .type('12').should('have.value', '12')
     cy.get('#customer_sim')
      .type('12').should('have.value', '12')
     
    
   cy.get('.customer_status').select('4')

  cy.get('.customer_status').click()
     cy.get('#company_name')
      .type('abc').should('have.value', 'abc')
     cy.get('#company_phone')
      .type('123').should('have.value', '123')
     cy.get('#company_address')
      .type('jgj').should('have.value', 'jgj')
     cy.get('#customer_ktp_file')
    // cy.get('#agreement')
       //  .check.should('.checked')

     //cy.get('#wp-view'.click()

  
  
   })

})