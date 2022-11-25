package br.senai.sp.jandira.gameproject.dao

import android.content.Context
import androidx.room.*
import br.senai.sp.jandira.gameproject.R
import br.senai.sp.jandira.gameproject.model.Console

class ConsoleDAO {

    companion object {

        fun getConsole(context: Context): List<Console> {

            val pt1 = Console();
            pt1.id = 1;
            pt1.nome = "Playstation 4";
            pt1.anoLancamento = 2013;
            pt1.fabricante = "Sony"
            pt1.descricao = "O PlayStation 4, ou simplesmente PS 4, é o tão aguardado console da quarta geração da Sony, trazendo uma arquitetura semi-customizada da AMD com 8 GB de memória RAM GDDR5 compartilhada entre CPU e GPU (placa de vídeo). Produzido pela Sony, o Play 4 é um dos consoles mais famosos do mundo e nele você consegue jogar jogos incríveis como FIFA, Minecraft, Call of Duty The Last of Us, Uncharted, Far Cry entre tantos outros. O videogame dispõe de uma tecnologia que acaba sendo uma central multimídia possibilitando rodar DVD, discos Blu-Ray, vídeos e aplicativos de streaming. Com este console você pode jogar online com os amigos ou fazer gravações dos jogos de forma super prática. Pressionando obotão share você consegue compartilhar no Youtube, Facebook, Twitter e Twitch.";

            val pt2 = Console();
            pt2.id = 2;
            pt2.nome = "Playstation 5";
            pt2.anoLancamento = 2020;
            pt2.fabricante = "Sony"
            pt2.descricao = "O PlayStation 5 é um console desenvolvido e comercializado pela Sony. Agora ele está disponível em duas versões: uma com leitor de discos BluRay e outra sem. Um dos grandes destaques do videogame é seu novo controle, o DualSense. Ele possui gatilhos adaptáveis, que se comportam de maneira diferente de acordo com o que está acontecendo no jogo, seja atirando com uma arma ou freando um carro. Esses controles também possuem uma resposta tátil mais inteligente e dinâmica, que simula com maior precisão detalhes como andar na grama ou em uma quadra de basquete. Outra grande melhoria, com relação à geração anterior, é a utilização de um SSD próprio da Sony. Isso possibilita carregamentos praticamente instantâneos dos jogos, além de acelerar a velocidade de instalação de aplicativos. O PS 5 já conta com uma galeria de jogos exclusivos e diversos outros ainda estão para chegar, como: God of War: Ragnarok, Marvel’s Spider Man 2, Horizon Forbidden West e Project Athia.";

            val pt3 = Console();
            pt3.id = 3;
            pt3.nome = "Xbox One";
            pt3.anoLancamento = 2013;
            pt3.fabricante = "Microsoft"
            pt3.descricao = "O Xbox One veio com boas atualizações de hardware em relação à geração anterior. Ele recebeu melhorias no sistema de refrigeração, garantindo uma experiência estável na hora de jogar. Outro ponto interessante é o fato de a Microsoft apostar em uma central de entretenimento. Ele possui apenas entradas digitais, entre as quais: uma saída HDMI para a televisão, uma Entrada HDMI, conexão LAN, saída de áudio digital, 2x USB 3.0, conexão proprietária do Kinect e, na lateral, outra entrada USB 3.0. O console possui um processador único, desenvolvido pela AMD e conta com apenas 500 GB de armazenamento em HDD mais 8 GB de RAM. Seu controle tem uma autonomia estimada de até 10 dias de uso constante, utilizando duas pilhas AAA. Sendo uma central de entretenimento, ele possui alguns recursos que integram funcionalidades presentes na TV ao qual está conectado, como aplicativos de streaming. Ele aceita comandos de voz e também responde a controles universais através do infra-vermelho.";

            val pt4 = Console();
            pt4.id = 4;
            pt4.nome = "Xbox Series X";
            pt4.anoLancamento = 2020;
            pt4.fabricante = "Sony"
            pt4.descricao = "O Xbox Series X promete um dos melhores desempenhos já vistos no mundo dos consoles, sendo capaz de rodar jogos com resolução 4K a até 120 frames por segundo, graças a uma GPU da AMD de 12 Teraflops. Toda essa qualidade de gráficos, com direito ao Ray Tracing, faz do vídeo-game um sucesso de vendas. O jogador ainda pode assinar o serviço Xbox Game Pass e ter acesso a jogos exclusivos como Gears 5, Ori and the Blind Forest e Forza Horizon 4. O console também executa os games do Xbox One e vários jogos do Xbox 360. Com o SSD de 1 TB de armazenamento, é possível baixar muito conteúdo. Entretanto, há opções de upgrades, adicionando novos SSDs de 512 GB ou até 1 TB. Outro ponto positivo do aparelho é o fato de os acessórios das versões anteriores servirem no Xbox Series X, com isso você consegue aproveitar controles, volantes e headsets. Por fim, o novo serviço do Xbox Cloud Gaming permite jogar games em nuvem, seja no console ou até em outros dispositivos.";

            val pt5 = Console();
            pt5.id = 5;
            pt5.nome = "Nintendo Switch";
            pt5.anoLancamento = 2017;
            pt5.fabricante = "Nintendo"
            pt5.descricao = "Nintendo Switch é o mais recente console da empresa japonesa Nintendo. Lançado dia 3 de março de 2017, o videogame promete oferecer a potência de um console de mesa unido à praticidade de um portátil. Jogos de peso já fazem parte do repertório do Nintendo Switch, como The Legend of Zelda: Breath of the Wild, Super Mario Odyssey, Splatoon, Pokémon Let's Go e Super Smash Bros. O Switch tem três modos de jogo: o Modo TV, em que você o conecta na televisão por um cabo HDMI; o modo de superfície, no qual os Joy-Cons são destacados da lateral do aparelho e a tela fica apoiada em uma superfície; e o modo portátil, com ambos Joy-Cons conectados na tela principal do Switch. O design do aparelho se assemelha a um tablet, pois possui tela destacável, capaz de exibir games e funcionar como uma “micro TV”.";

            val consolesList = listOf<Console>(pt1, pt2, pt3, pt4, pt5);
            consolesList

            return consolesList;

        }
    }
}














//@Dao
//interface ConsoleDAO {
//
//    @Insert
//    fun save(console: Console): Long
//
//    @Update
//    fun update(console: Console): Int
//
//    @Delete
//    fun delete(console: Console): Int
//
//    @Query("SELECT * FROM tbl_console WHERE id = :id")
//    fun getConsoleById(id: Int): Console
//
//}