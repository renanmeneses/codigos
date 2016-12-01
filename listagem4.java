  /// <summary>

    /// Director - Conecta as parter produzidas

    ///     <remarks>

    ///         A Montadora usa a ConstruirVeiculo para construir uma variedade de Veiculo

    ///         em uma série de passos sequenciais.

    ///     </remarks>

    /// </summary>

    public class Montadora

    {

        /// <summary>

        /// Para todos os objetos da estrutura.

        /// </summary>

        /// <param name="construirVeiculo"></param>

        public void Construir(ConstruirVeiculo construirVeiculo)

        {

            construirVeiculo.ContruirChassi();

            construirVeiculo.ConstruirRodas();

            construirVeiculo.ConstruirPortas();

            construirVeiculo.ConstruirMotor();

        }

    }