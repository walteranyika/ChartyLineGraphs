package com.inspire.chartylines;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // LineChart chart= (LineChart) findViewById(R.id.chart);
       // chart.setDescription("Earnings against expenditure");


//values for datainput Dataset1 at your axisone positions
        ArrayList<Entry> dataset1 = new ArrayList<Entry>();
        dataset1.add(new Entry(1f, 0));
        dataset1.add(new Entry(3f, 1));
        dataset1.add(new Entry(7f, 2));
        dataset1.add(new Entry(2f, 3));
        dataset1.add(new Entry(8f, 4));
        dataset1.add(new Entry(5f, 5));
        dataset1.add(new Entry(4f, 6));



       //values for datainput Dataset2 at your axisone positions
        ArrayList<Entry> dataset2 = new ArrayList<Entry>();
        dataset2.add(new Entry(3f, 0));
        dataset2.add(new Entry(6f, 2));
        dataset2.add(new Entry(1.5f, 3));
        dataset2.add(new Entry(8f, 4));
        dataset2.add(new Entry(5f, 5));
        dataset2.add(new Entry(2f, 6));
        dataset2.add(new Entry(9f, 7));
       // , "6", "8", "9"

        // Union from xAxisOne and xAxisTwo
        String[] xAxis = new String[] {"JAN", "FEB", "MAR", "APR", "MAY", "JUN","JUL"};
        ArrayList<LineDataSet> lines = new ArrayList<LineDataSet>();

        LineDataSet lDataSet1 = new LineDataSet(dataset1, "Expenses");
        lDataSet1.setColor(Color.RED);
        lDataSet1.setCircleColor(Color.RED);
        lines.add(lDataSet1);
        lines.add(new LineDataSet(dataset2, "Income"));

        LineChart chart = (LineChart)findViewById(R.id.chart);
        chart.setData(new LineData(xAxis, lines));

    }

}
