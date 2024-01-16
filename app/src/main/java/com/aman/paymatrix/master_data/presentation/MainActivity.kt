//package com.aman.taxcalculator.master_data.presentation
//
//import android.content.Context
//import android.graphics.Bitmap
//import android.graphics.BitmapFactory
//import android.os.Bundle
//import android.os.Environment
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import com.aman.taxcalculator.R
//import com.aman.taxcalculator.ui.theme.TaxCalculatorTheme
//import com.itextpdf.io.image.ImageDataFactory
//import com.itextpdf.kernel.pdf.PdfDocument
//import com.itextpdf.kernel.pdf.PdfWriter
//import com.itextpdf.layout.Document
//import com.itextpdf.layout.element.Image
//import com.itextpdf.layout.element.Paragraph
//import com.itextpdf.layout.element.Table
//import com.itextpdf.layout.property.TextAlignment
//import com.itextpdf.layout.property.UnitValue
//import java.io.ByteArrayOutputStream
//import java.io.File
//import java.io.FileOutputStream
//import java.text.SimpleDateFormat
//import java.util.Date
//import java.util.Locale
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            TaxCalculatorTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
//                ) {
//                    val context = LocalContext.current
//
//                    MasterData()
//
////                    Column(modifier = Modifier.fillMaxSize()) {
////                        Button(onClick = {
////                            generateInvoice(context)
////
////                        }) {
////                            Text(text = "Generate Invoice")
////                        }
////                    }
//                }
//            }
//        }
//    }
//
//
//    private fun generateInvoice(context: Context) {
//        val pdfFileName = "invoice.pdf"
//        val folder = File(
//            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
//            "Invoices"
//        )
//
//        if (!folder.exists()) {
//            folder.mkdirs()
//        }
//
//        val file = File(folder, pdfFileName)
//        file.createNewFile()
//
//        val pdfWriter = PdfWriter(FileOutputStream(file))
//        val pdfDocument = PdfDocument(pdfWriter)
//        val document = Document(pdfDocument)
//
////         Add company logo
//        val imageBitmap = drawableIdToBitmap(context = context, R.drawable.background)
//        val imageByteArray = bitmapToByteArray(imageBitmap)
//        val imageData = ImageDataFactory.create(imageByteArray)
//        val logo = Image(imageData)
//        logo.scaleToFit(100f, 100f)
//        document.add(logo)
//
//
//        // Company details
//        val companyName = "Your Company Name"
//        val companyAddress = "123 Main Street, City, Country"
//        val companyDetails = Paragraph().add(companyName).add("\n").add(companyAddress)
//        document.add(companyDetails)
//
//        // Invoice details
//        val invoiceNumber = "Invoice #: INV2023001"
//        val invoiceDate = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())
//        val invoiceDetails = Paragraph().add(invoiceNumber).add("\n").add("Date: $invoiceDate")
//            .setTextAlignment(TextAlignment.RIGHT)
//        document.add(invoiceDetails)
//
//        // Invoice content (e.g., table with items)
//        val items = arrayOf(
//            arrayOf("Item 1", "Description 1", "100"),
//            arrayOf("Item 2", "Description 2", "150"),
//            arrayOf("Item 3", "Description 3", "75")
//        )
//
//        val table = Table(UnitValue.createPercentArray(3)).useAllAvailableWidth()
//        table.addCell("Item")
//        table.addCell("Description")
//        table.addCell("Amount")
//
//        items.forEach { item ->
//            table.addCell(item[0])
//            table.addCell(item[1])
//            table.addCell(item[2])
//        }
//        document.add(table)
//
//        // Total amount
//        val totalAmount = items.sumByDouble { it[2].toDouble() }
//        val totalParagraph = Paragraph("Total: $$totalAmount").setTextAlignment(TextAlignment.RIGHT)
//        document.add(totalParagraph)
//
//        // Close the document
//        document.close()
//    }
//
//    // Function to convert drawable resource ID to Bitmap
//    fun drawableIdToBitmap(context: Context, drawableId: Int): Bitmap {
//        return BitmapFactory.decodeResource(context.resources, drawableId)
//    }
//
//    // Function to convert Bitmap to ByteArray (PNG format)
//    fun bitmapToByteArray(bitmap: Bitmap): ByteArray {
//        val outputStream = ByteArrayOutputStream()
//        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
//        return outputStream.toByteArray()
//    }
//
//}
//
