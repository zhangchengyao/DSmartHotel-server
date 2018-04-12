package application.multiAgent.agent;

import jade.content.lang.Codec;
import jade.content.lang.sl.SLCodec;
import jade.content.onto.*;
import jade.core.Agent;
import application.multiAgent.behavior.listener.ConsultListener;
import application.multiAgent.ontology.*;
import application.multiAgent.agentHelper.DFUtil;

/**
 * Created by h77 on 2017/5/5.
 * 简单的协商Agent
 */
public class ConsultAgent extends Agent {

    private Codec codec = new SLCodec();
    private Ontology ontology = BidOntology.getInstance();

    protected void setup() {
        getContentManager().registerLanguage(codec);
        getContentManager().registerOntology(ontology);
        DFUtil.registerService(this,"consult");
        System.out.println("创建 ConsultAgent");
        addBehaviour(new ConsultListener(this));
    }
}