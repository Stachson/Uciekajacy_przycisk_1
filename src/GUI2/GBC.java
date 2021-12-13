package GUI2;

import java.awt.*;

public class GBC extends GridBagConstraints
{
    public GBC(int gridx, int gridy, int gridwidth, int gridheight)
    {
        this.gridx=gridx;
        this.gridy=gridy;
        this.gridwidth=gridwidth;
        this.gridheight=gridheight;
    }

    public GBC setWeight(double weightx, double weighty)
    {
        this.weightx=weightx;
        this.weighty=weighty;
        return this;
    }

    public GBC setFill(int fill)
    {
        this.fill=fill;
        return this;
    }

}