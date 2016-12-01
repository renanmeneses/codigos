   /// <summary>

    /// Concret Builder - Construtor concreto 1.

    /// Constroi um veículo do tipo Moto

    /// </summary>

    class ConstrutorMoto : ConstruirVeiculo

    {

        public override void ContruirChassi()

        {

            veiculo = new Veiculo("Moto");

            veiculo["chassi"] = "Chassi da Moto";

        }

 

        public override void ConstruirMotor()

        {

            veiculo["motor"] = "500 cc";

        }

 

        public override void ConstruirRodas()

        {

            veiculo["rodas"] = "2";

        }

 

        public override void ConstruirPortas()

        {

            veiculo["portas"] = "0";

        }

    }

 

    /// <summary>

    /// Concret Builder - Construtor concreto 2.

    /// Constroi um veículo do tipo Carro

    /// </summary>

    class ConstrutorCarro : ConstruirVeiculo

    {

        public override void ContruirChassi()

        {

            veiculo = new Veiculo("Carro");

            veiculo["chassi"] = "Chassi do Carro";

        }

 

        public override void ConstruirMotor()

        {

            veiculo["motor"] = "2500cc";

        }

 

        public override void ConstruirRodas()

        {

            veiculo["rodas"] = "4";

        }

 

        public override void ConstruirPortas()

        {

            veiculo["portas"] = "4";

        }

    }