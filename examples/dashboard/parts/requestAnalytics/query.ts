export default 
`requests
| summarize count() by resultCode
| render piechart`;