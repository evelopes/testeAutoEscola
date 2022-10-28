import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlunoTest {

	@Test
	void testMenorFazerOExame() {
		Aluno a = new Aluno("Maria", 16);
		a.fazOExame();
		assertEquals(a.idade, 16, "N�o pode fazer o exame!");
	}
	

	@Test
	void testMaiorFazerOExame() {
		Aluno b = new Aluno("Melissa", 19);
		b.fazOExame();
		assertEquals(b.idade, 19, "J� pode fazer o exame!");
	}

}
