package com.aababou.cloudbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends ArrayAdapter<Transaction> {
    private Context context;
    private List<Transaction> transactions;

    public TransactionAdapter(Context context, List<Transaction> transactions) {
        super(context, 0, transactions);
        this.context = context;
        this.transactions = transactions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.transaction_item, parent, false);
        }


        Transaction transaction = transactions.get(position);


        ImageView imageViewLogo = convertView.findViewById(R.id.imageViewLogo);
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewDate = convertView.findViewById(R.id.textViewDate);
        TextView textViewAmount = convertView.findViewById(R.id.textViewAmount);


        imageViewLogo.setImageResource(transaction.getIconResId());
        textViewTitle.setText(transaction.getTitle());
        textViewDate.setText(transaction.getDate());
        textViewAmount.setText(transaction.getAmount());

        return convertView;
    }
}