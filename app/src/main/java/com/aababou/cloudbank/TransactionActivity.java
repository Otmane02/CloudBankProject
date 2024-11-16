package com.aababou.cloudbank;



import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class TransactionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction);

        ListView listViewTransactions = findViewById(R.id.listViewTransactions);
        ArrayList<Transaction> transactionList = new ArrayList<>();


        transactionList.add(new Transaction("Facture internet", "16/11/2024", "250.00", R.drawable.ic_phone));
        transactionList.add(new Transaction("Emission d'un", "16/11/2024", "5000.00", R.drawable.ic_signal));
        transactionList.add(new Transaction("Paiement d'un", "16/11/2024", "2990.00", R.drawable.ic_percent));
        transactionList.add(new Transaction("Paiement par carte", "16/11/2024", "500.00", R.drawable.ic_card));
        transactionList.add(new Transaction("Retrait d'espèces", "16/11/2024", "1000.00", R.drawable.ic_money));

        TransactionAdapter adapter = new TransactionAdapter(this, transactionList);
        listViewTransactions.setAdapter(adapter);



    }
}
