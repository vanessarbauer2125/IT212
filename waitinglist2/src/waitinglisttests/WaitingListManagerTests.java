package waitinglisttests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import waitinglist.*;

public class WaitingListManagerTests {

    private WaitingListManager manager;

    @BeforeEach
    void setUp() {
        manager = new WaitingListManager();
    }

    @Test
    void addPerson_newPerson_personAdded() {
        manager.addPerson("Alice");
        assertTrue(manager.isPersonInList("Alice"));
        assertEquals(1, manager.waitingListSize());
    }

    @Test
    void addPerson_duplicatePerson_notAddedTwice() {
        manager.addPerson("Bob");
        manager.addPerson("Bob");
        assertEquals(1, manager.waitingListSize());
    }

    @Test
    void addPerson_emptyString_personShouldBeAddedButQuestionable() {
        manager.addPerson("");
        assertTrue(manager.isPersonInList(""));
    }

    @Test
    void servePerson_withPeople_returnsFirstPerson() {
        manager.addPerson("Charlie");
        manager.addPerson("Dana");
        assertEquals("Charlie has been served.", manager.servePerson());
    }

    @Test
    void servePerson_twiceAfterTwoAdds_bothServedInOrder() {
        manager.addPerson("Eve");
        manager.addPerson("Frank");
        assertEquals("Eve has been served.", manager.servePerson());
        assertEquals("Frank has been served.", manager.servePerson());
    }

    @Test
    void servePerson_whenEmpty_returnsMessage() {
        assertEquals("Waiting list is empty.", manager.servePerson());
    }

    @Test
    void isPersonInList_personNotAdded_returnsFalse() {
        assertFalse(manager.isPersonInList("Ghost"));
    }

    @Test
    void waitingListSize_multipleAdds_correctCount() {
        manager.addPerson("A");
        manager.addPerson("B");
        manager.addPerson("C");
        assertEquals(3, manager.waitingListSize());
    }

    @Test
    void waitingListSize_afterServe_correctCount() {
        manager.addPerson("A");
        manager.addPerson("B");
        manager.servePerson();
        assertEquals(1, manager.waitingListSize());
    }

    @Test
    void addPerson_nullInput_doesNotThrow_butShouldNotBeInList() {
        assertDoesNotThrow(() -> manager.addPerson(null));
        assertFalse(manager.isPersonInList(null));  // current behavior (assuming no null support)
    }
}
